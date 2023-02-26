package Modul_10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.regex.Pattern;

public class InputNumbersTest {
    public static void main(String[] args) {
        File files = new File("C:\\Users\\sinav\\Goit-Course\\MyArrayList\\src\\numbers.txt");
        Pattern pattern = Pattern.compile("^([/(]\\d{3}[/)])+(\\s\\d{3}[-]\\d{4})|(\\d{3}[-]\\d{3}[-]\\d{4})");
        if (files.exists()) {
            try {
                InputStream fis = new FileInputStream(files);
                Scanner scanner = new Scanner(fis);
                while (scanner.hasNextLine()) {
                    String number = scanner.nextLine();
                    if (pattern.matcher(number).matches()) {
                        System.out.println(number);
                    }
                }
            } catch (FileNotFoundException e) {
                e.getStackTrace();
            }
        }

    }
}
