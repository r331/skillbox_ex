package ru.skillbox.ex5;

import java.io.IOException;

public class Main3 {
    public static void main(String[] args) {
        System.out.println(finallyReturn());
    }
    static int finallyReturn(){
        try{
            //return 1;
            throw new IOException();
        } finally {
            return 2;
        }
    }

    static void finallyReturn2() throws IOException {
        String s = null;
        try {
            throw new IOException();
        } finally {
            s.length();
        }
    }

}
