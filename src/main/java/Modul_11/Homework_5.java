package Modul_11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Homework_5 {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(4,6,8,9,15);
        Stream<Integer> stream2 = Stream.of(44,55,77,133,99);
        Stream<Integer> zip = zip(stream1,stream2);
        System.out.println(zip.collect(Collectors.toList()));
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        List<T> res= new ArrayList<>();
      Iterator<T> iterator1 = first.iterator();
      Iterator<T> iterator2 = second.iterator();
      while (iterator1.hasNext()&&iterator2.hasNext()){
          res.add(iterator1.next());
          res.add(iterator2.next());
      }
      return res.stream();
    }
}
