package Module_12;

    public class PrintText {
        public static void main(String[] args) {
            Thread timerThread = new TimerThread();
            Thread messageThread = new MessageThread();

            timerThread.start();
            messageThread.start();
        }

        public static class TimerThread extends Thread {
            @Override
            public void run() {
                long startTime = System.currentTimeMillis();
                while (true) {
                    long elapsedTime = System.currentTimeMillis() - startTime;
                    System.out.println("Elapsed time: " + elapsedTime / 1000 + " seconds");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        public static class MessageThread extends Thread {
            @Override
            public void run() {
                while (true) {

                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("5 seconds passed");
                }
            }
        }
    }




