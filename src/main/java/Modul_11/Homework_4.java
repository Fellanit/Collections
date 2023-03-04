package Modul_11;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Math.pow;


public class Homework_4 {
    
        public static Stream<Long> generate(long a, long c, long m, long seed) {
            return Stream.iterate(seed, n -> (a * n + c) % m);
        }

        public static void main(String[] args) {
            long a = 25214903917L;
            long c = 11L;
            long m = (long) Math.pow(2,48);

            Stream<Long> randomStream = Homework_4.generate(a, c, m, 1L);
            randomStream.limit(10).forEach(System.out::println);
        }
    }

