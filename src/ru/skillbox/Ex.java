package ru.skillbox;

import java.nio.channels.NoConnectionPendingException;
import java.util.Random;

public class Ex {
    static int counter = 0;
    static int delete = new Random().nextInt(20);
    static void save(String s){
        counter++;
        if(counter == delete)
            throw new NoConnectionPendingException();
        System.out.println("Сохранено " + s);
    }
}
