package Modul_11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Homework_3 {
    public static void main(String[] args) {
        String[] stringArray = {"1, 2, 0", "4, 5"};

        List<Integer> list = Arrays.stream(stringArray)
                .flatMap(s -> Arrays.stream(s.split(", ")))
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());

        String result = list.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println(result);


    }
}
