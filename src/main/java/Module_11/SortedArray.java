package Module_11;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedArray {
    public static void main(String[] args) {
        Stream<String> nameStream;
        nameStream = Stream.of("Ivan", "Kristina", "OLeg", "Artem", "Peter", "Julia")
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder());
        List<String> names = nameStream.collect(Collectors.toList());
        System.out.println(names);
    }
}
