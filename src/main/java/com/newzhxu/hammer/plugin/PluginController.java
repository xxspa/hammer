package com.newzhxu.hammer.plugin;

import com.newzhxu.GreetingExtension;
import org.pf4j.PluginWrapper;
import org.pf4j.spring.SpringPluginManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/plugin")
public class PluginController {
    private final SpringPluginManager springPluginManager;
    private final List<GreetingExtension> greetingExtensions;

    public PluginController(SpringPluginManager springPluginManager, List<GreetingExtension> greetingExtensions) {
        this.springPluginManager = springPluginManager;
        this.greetingExtensions = greetingExtensions;
    }

    @GetMapping("/list")
    public List<String> listPlugins() {
        return springPluginManager.getPlugins().stream().map(PluginWrapper::toString).toList();
    }

    @GetMapping("/call")
    public List<String> call() {
        return springPluginManager.getExtensions(GreetingExtension.class).stream().map(e -> e.greet("111")).toList();


    }
}
