package ru.skillbox.ex5;

public class Main5 {
    static int finallyReturn(){
        try{
            if(true)
                throw new RuntimeException();
            return 1;
        } finally {
            return 2;
        }
    }

}
