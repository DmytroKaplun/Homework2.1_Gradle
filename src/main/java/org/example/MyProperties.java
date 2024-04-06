package org.example;

public class MyProperties {
    private final String name;
    private final String lastName;

    private MyProperties() {
        name = "Dmytro";
        lastName = "Kaplun";
    }

    private static final class InstanceHolder {
        private static final MyProperties instance = new MyProperties();
    }

    public static MyProperties getInstance() {
        return InstanceHolder.instance;
    }
}
