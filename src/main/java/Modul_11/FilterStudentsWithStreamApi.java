package Modul_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FilterStudentsWithStreamApi {
    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "Petro", "Fedir", "Andriy", "Bogdan");
        String result = IntStream.range(0, names.size())
                .filter(i -> i % 2 == 1)
                .mapToObj(i -> i + ". " + names.get(i))
                .collect(Collectors.joining(", "));
        System.out.println("result = " + result);
    }
}
