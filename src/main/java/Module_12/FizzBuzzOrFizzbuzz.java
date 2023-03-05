package Module_12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FizzBuzzOrFizzbuzz {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newScheduledThreadPool(4);
        ThreadServiceMethods threadServiceMethods = new ThreadServiceMethods(1);
       while (threadServiceMethods.getDigits() > 0){
           executorService.submit(() -> {
               try {
                   threadServiceMethods.fizz();
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           });
           executorService.submit(()-> {
               try {
                   threadServiceMethods.buzz();
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           });
           executorService.submit(()->{
               try {
                   threadServiceMethods.fizzbuzz();
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           });
           executorService.submit(()-> {
               try {
                   threadServiceMethods.number();
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           });
       }


    }

}
