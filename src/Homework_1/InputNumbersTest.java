package Homework_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class InputNumbersTest {
    public static void main(String[] args) {
        File files = new File("C:\\Users\\sinav\\Goit-Course\\MyArrayList\\src\\numbers.txt");
        System.out.println("files.exists() = " + files.exists());
        try {
            InputStream in = new FileInputStream(files);
            Scanner scanner = new Scanner(in);
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.getStackTrace();
        }
    }
}
