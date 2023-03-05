package Module_12;

public class ThreadServiceMethods {
    public int getDigits() {
        return digits;
    }

    private int digits;

    public ThreadServiceMethods(int digits) {
        this.digits = digits;
    }

    public synchronized void fizz() throws InterruptedException {
        while (digits < 21) {
            if (digits % 3 == 0 && digits % 5 != 0) {
                System.out.println("fizz");
                Thread.currentThread().notifyAll();
            } else {
                Thread.currentThread().wait();
            }
            digits++;
        }

    }

    public synchronized void buzz() throws InterruptedException {
        while (digits < 21) {
            if (digits % 5 == 0 && digits % 3 != 0) {
                System.out.println("buzz");
                Thread.currentThread().notifyAll();
            } else {
                Thread.currentThread().wait();
            }
            digits++;

        }
    }

    public synchronized void fizzbuzz() throws InterruptedException {
        while (digits < 21) {
            if (digits % 15 == 0) {
                System.out.println("fizzbuzz");
                Thread.currentThread().notifyAll();
            } else {
                Thread.currentThread().wait();
            }
            digits++;

        }
    }

    public synchronized void number() throws InterruptedException {
        while (digits < 21) {
            if (digits % 3 != 0 && digits % 5 != 0) {
                System.out.println(digits);
                Thread.currentThread().notifyAll();
            } else {
                Thread.currentThread().wait();
            }
            digits++;

        }
    }
}