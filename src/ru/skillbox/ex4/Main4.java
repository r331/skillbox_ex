package ru.skillbox.ex4;

public class Main4 {
    public static void main(String[] args) {
        divide100byInt(20);
        divide100byInt(0);
        divide100byInt(10);
    }

    static void divide100byInt(int a) {
        try {
            System.out.println(100 / a);
        }catch (ArithmeticException exception){
            System.out.println("Внимание! Деление на 0");
        }
    }
}
