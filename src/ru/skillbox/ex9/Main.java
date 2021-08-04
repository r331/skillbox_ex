package ru.skillbox.ex9;

import java.security.InvalidParameterException;

public class Main {
    static void printWithEx(String s) {
        if (s == null)
            return;
        System.out.println(s.length());
    }

    static void printWithException(String s) {
        if (s == null)
            throw new InvalidParameterException();
        System.out.println(s.length());
    }

    static void catchException() {
        try {
            throw new Exception();
        } catch (Exception e) {

        }
    }
}
