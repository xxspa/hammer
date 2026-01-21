package com.newzhxu.hello;

import com.newzhxu.GreetingExtension;
import org.pf4j.Extension;
import org.pf4j.PluginWrapper;
import org.pf4j.spring.SpringPlugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

public class HelloPlugin extends SpringPlugin {
    Logger logger = LoggerFactory.getLogger(HelloPlugin.class);
    ApplicationContext applicationContext;

    public HelloPlugin(PluginWrapper wrapper) {
        super(wrapper);
    }

    @Override
    public void start() {
        super.start();
        System.out.println("HelloPlugin started");
    }


    @Override
    public void stop() {
        super.stop();
        System.out.println("HelloPlugin stopped");
    }

    @Override
    public void delete() {
        super.delete();
        System.out.println("HelloPlugin deleted");
    }

    @Override
    protected ApplicationContext createApplicationContext() {
        logger.info("HelloPlugin createApplicationContext");
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.newzhxu.hello");
        applicationContext.setClassLoader(wrapper.getPluginClassLoader());
        applicationContext.register(HelloConfig.class);
        applicationContext.refresh();

        this.applicationContext = applicationContext;

        return applicationContext;
    }

    @Extension
    @Component
    public static class HelloGreetingExtension implements GreetingExtension {
        @Override
        public String greet(String name) {
            return "111111111111111Hello, " + name + "!";
        }
    }


}