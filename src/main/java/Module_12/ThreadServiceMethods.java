package Module_12;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.Thread.sleep;

public class ThreadServiceMethods {

    public static volatile AtomicInteger digits = new AtomicInteger(1);
    public BlockingQueue<String> queue = new LinkedBlockingQueue<>();

    private int n = 20;

    public synchronized void add(String element) {
        queue.add(element);
    }

    public void setN(int n) {
        this.n = n;
    }

    public synchronized void fizz()  {
        while (digits.get() < 21) {
            if (digits.get() % 3 == 0 && digits.get() % 5 != 0) {
                add("fizz");
                digits.getAndIncrement();
                notifyAll();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }

    }

    public synchronized void buzz()  {
        while (digits.get() < 21) {
            if (digits.get() % 5 == 0 && digits.get() % 3 != 0) {
                add("buzz");
                digits.getAndIncrement();
                notifyAll();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }

    public synchronized void fizzbuzz()  {
        while (digits.get() < 21) {
            if (digits.get() % 15 == 0) {
                add("fizzbuzz");
                digits.getAndIncrement();
                notifyAll();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }

    public synchronized void number() {
        while (digits.get() < 21) {
            if (digits.get() % 3 != 0 && digits.get() % 5 != 0) {
                add(String.valueOf(digits));
                digits.getAndIncrement();
                notifyAll();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }

    public void print() {
        while (true) {

            while (!queue.isEmpty()) {

                try {
                    sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                if (queue.size() > 1)
                    System.out.print(queue.poll() + ", ");
                else System.out.print(queue.poll());

            }
            notifyAll();
        }
    }
}
