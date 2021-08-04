package ru.skillbox.ex4;

public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Hello");
    }
}
