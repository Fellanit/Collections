package Modul_10;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class FrequencyOfRepetitionOfWords {
    public static void main(String[] args) {
        Map<String, Integer> frequencyOfWords = new HashMap<>();
        int value = 1;
        try {
            File file = new File("src/main/java/words.txt");
            System.out.println("file.exists() = " + file.exists());
            InputStream fis = new FileInputStream(file);
            Scanner scanner = new Scanner(fis);
            while (scanner.hasNext()) {
                String word = scanner.nextLine();
                String[] strArray = word.split(" ");
                String result = "";
                for (int i = 0; i < strArray.length; i++) {
                    result = strArray[i];

                    if (frequencyOfWords.containsKey(result)) {
                        int currWord = frequencyOfWords.get(result);
                        frequencyOfWords.put(result, currWord + value);
                    } else {
                        frequencyOfWords.put(result, value);
                    }
                }
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                Integer value1 = frequencyOfWords.get(o1);
                Integer value2 = frequencyOfWords.get(o2);
                return value1.compareTo(value2) > 0 ? 1 : -1;
            }
        };
        Map<String, Integer> result = new TreeMap<>(comparator.reversed());
        result.putAll(frequencyOfWords);
        System.out.println(result);
    }
}

