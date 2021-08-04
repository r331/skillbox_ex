package ru.skillbox.ex5;

import java.io.IOException;

public class Main7 {
    public static void main(String[] args) throws IOException {
        finallyReturn();
    }
    static void finallyReturn() throws IOException {
        String s = null;
        try {
            throw new IOException();
        } finally {
            s.length();
        }
    }

}
