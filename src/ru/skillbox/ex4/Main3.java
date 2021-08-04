package ru.skillbox.ex4;

public class Main3 {
    public static void main(String[] args) throws Exception{
        calc();
    }

    private static void calc() throws Exception{
        print();
    }

    private static void print() throws Exception{
        throw new Exception();
    }
}
