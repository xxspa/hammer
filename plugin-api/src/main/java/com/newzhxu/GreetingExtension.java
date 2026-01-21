package com.newzhxu;

import org.pf4j.ExtensionPoint;

public interface GreetingExtension extends ExtensionPoint {
    String greet(String name);
}