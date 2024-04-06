package org.example;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        MyProperties name = MyProperties.getInstance();
        System.out.println(new Gson().toJson(name));
    }
}