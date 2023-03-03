package Modul_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FilterStudentsWithStreamApi {
    public static void main(String[] args) {
        Stream<String> nameStream;
        nameStream = Stream.of("1. Ivan", "2. Kristina", "3. OLeg", "4. Artem", "5. Peter", "6. Julia")
                .filter(s -> (s.charAt(0) % 2) != 0);
        List<String> oddNames = nameStream.collect(Collectors.toList());
        System.out.println(oddNames);
    }
}
