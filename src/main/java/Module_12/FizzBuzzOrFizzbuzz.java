package Module_12;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class FizzBuzzOrFizzbuzz {

    private final int n = 20;
    public static volatile AtomicInteger digits = new AtomicInteger(1);
    public BlockingQueue<String> queue = new LinkedBlockingQueue<>();
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newScheduledThreadPool(4);
        ThreadServiceMethods threadServiceMethods = new ThreadServiceMethods();
        threadServiceMethods.setN(20);
        executorService.submit(threadServiceMethods::fizz);
        executorService.submit(threadServiceMethods::buzz);
        executorService.submit(threadServiceMethods::fizzbuzz);
        executorService.submit(threadServiceMethods::number);
        executorService.submit(threadServiceMethods::print);
        executorService.shutdown();
    }


}


