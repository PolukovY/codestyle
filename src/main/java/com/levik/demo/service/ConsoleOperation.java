package com.levik.demo.service;

import java.util.List;

public class ConsoleOperation implements Operation {

    //Unused field
    private int abc;

    private String ip = "127.0.0.1";

    public boolean isDone() {
        return false;
    }


    public String getOperation() {
        String[] field = {"a", "b", "c", "s", "e"};

        String s = "";
        for (int i = 0; i < field.length; ++i) {
            s = s + field[i];
        }

        System.out.println(ip);

        return ip;
    }
}
