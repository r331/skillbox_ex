package ru.skillbox.ex7;

import java.io.IOException;
import java.security.GeneralSecurityException;

public class Main {
    public static class Reader implements AutoCloseable {

        public void read() {
            System.out.println("Reader read");
        }

        @Override
        public void close() throws Exception {
            System.out.println("Reader closed!");
            throw new GeneralSecurityException();
        }
    }

    public static class Writer implements AutoCloseable {

        public void write() {
            System.out.println("Writer write!");
        }

        @Override
        public void close() throws IOException {
            System.out.println("Writer closed!");
            throw new IOException();
        }
    }


    void test() {
        try (var writer = new Writer();
             var reader = new Reader()) {
            reader.read();
            writer.write();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Main().test();
        System.out.println("Finish");
    }
}
