package ru.skillbox.ex8;

class MyException extends RuntimeException {
    MyException() {
        super();
    }

    MyException(String msg) {
        super(msg);
    }

    MyException(String msg, Throwable cause) {
        super(msg, cause);
    }
}


public class Main {
    public static void main(String[] args) {

    }

    static void myException(String slovo) {
        try {
            System.out.printf("Длина слова %d%n", slovo.length());
        } catch (NullPointerException exception) {
            throw new MyException(); // 1
            //throw new MyException("Ошибка в печати длины"); //2
            //throw new MyException("Ошибка в печати длины", exception); //3
        }
    }

}
