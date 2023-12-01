package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        MyName myName = new MyName("Sviatoslav", "Bessarab");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(myName);

        System.out.println(json);
    }
}