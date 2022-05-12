package com.example.demo.Model;

public class GenerateId {
    static int id = 0;

    public static int getId() {
        return id++;
    }

}
