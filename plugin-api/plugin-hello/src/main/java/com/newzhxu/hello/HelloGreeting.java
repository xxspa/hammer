package com.newzhxu.hello;

import com.newzhxu.GreetingExtension;
import org.pf4j.Extension;
import org.springframework.stereotype.Component;

@Extension(ordinal = 1)
@Component
public class HelloGreeting implements GreetingExtension {
    @Override
    public String greet(String name) {
        return "Hello, " + name + "!";
    }
}
