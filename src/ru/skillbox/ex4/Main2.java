package ru.skillbox.ex4;

public class Main2 {
    public static void main(String[] args) {
        throw new RuntimeException();
        //System.out.println("Hello");
    }
    public static void main1(String[] args) {
        try {
            throw new RuntimeException();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Hello");
    }

}
