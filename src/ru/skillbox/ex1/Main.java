package ru.skillbox.ex1;

import static ru.skillbox.ex1.Ex.save;

public class Main {
    public static void main(String[] args) {
        for (var i = 0; i < 10; i++) {
            save("" + i);
        }

        System.out.println("Успешно сохранено");
    }
}
