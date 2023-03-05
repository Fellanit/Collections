package Module_11;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
