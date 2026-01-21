package com.newzhxu.hammer.plugin;

import com.newzhxu.GreetingExtension;
import org.apache.commons.lang3.StringUtils;
import org.pf4j.spring.SpringPluginManager;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.Assert;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

@Configuration

public class PluginConfig {
    @Bean
    public SpringPluginManager springPluginManager() {
        SpringPluginManager springPluginManager = new SpringPluginManager();
        Path path = Path.of(System.getProperty("user.home") + "/plugin/");
        try (Stream<Path> list = Files.list(path)) {
            list.filter(e -> StringUtils.endsWithIgnoreCase(e.toString(), ".jar"))
                    .forEach(springPluginManager::loadPlugin);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        springPluginManager.startPlugins();
        return springPluginManager;
    }

    @Bean
    GroupedOpenApi pluginGroupedOpenApi() {
        return GroupedOpenApi.builder()
                .group("plugin")
                .pathsToMatch("/plugin/**")
                .build();
    }

    @Bean
    public CommandLineRunner init(SpringPluginManager springPluginManager) {


        return args -> {
            List<GreetingExtension> extensions = springPluginManager.getExtensions(GreetingExtension.class);
            Assert.notEmpty(extensions, "No GreetingExtension found");
            extensions.forEach(extension -> {
                System.out.println(extension.greet("From PluginConfig"));
            });
        };

    }
}
