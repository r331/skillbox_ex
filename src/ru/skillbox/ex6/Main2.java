package ru.skillbox.ex6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main2 {
    static void copyFiles(String read, String write) throws FileNotFoundException {
        var scanner = new Scanner(new File(read));
        var writer = new PrintWriter(write);
        try (scanner; writer) {
            while (scanner.hasNext()) {
                writer.print(scanner.nextLine());
            }
        }
    }

}
