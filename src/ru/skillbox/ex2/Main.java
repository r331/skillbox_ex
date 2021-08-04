package ru.skillbox.ex2;

public class Main {
    public static void main(String[] args) {
        var str = "Привет";
        print(str);
        str = null;
        print(str);
    }

    static void print(String s) {
        System.out.println(s.length());
    }
}
