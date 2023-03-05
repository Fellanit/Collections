package Module_12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FizzBuzzOrFizzbuzz {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newScheduledThreadPool(1);
        for (int i = 1; i < 25; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("fizz");
            } else if (i % 15 == 0) {
                System.out.println("fizzbuzz");
            } else {
                System.out.println(i);
            }
        }
        executorService.shutdown();
    }
}
