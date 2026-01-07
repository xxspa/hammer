package com.newzhxu.hammer.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import lombok.extern.slf4j.Slf4j;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class SwggerConfig {
    @Bean
    OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components()
                        .addSecuritySchemes("basicAuth",
                                new SecurityScheme()
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("basic")
                        ))
                .addSecurityItem(new SecurityRequirement().addList("basicAuth"));
    }

    @Bean
    GroupedOpenApi customGroupedOpenAPI() {
        return GroupedOpenApi.builder()
                .group("vps")
                .pathsToMatch("/vps/**")
                .displayName("VPS相关接口")
                .build();
    }
}
