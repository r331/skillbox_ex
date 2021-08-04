package ru.skillbox.ex6;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    static void copyFiles(String read, String write) throws IOException {
        try (var scanner = new Scanner(new File(read));
             var writer = new PrintWriter(write)) {
            while (scanner.hasNext()) {
                writer.print(scanner.nextLine());
            }
        }
    }
}
