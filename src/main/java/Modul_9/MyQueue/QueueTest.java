package Modul_9.MyQueue;

public class QueueTest {


    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue<String>();
        queue.add("First element");
        queue.add("Second element");
        queue.add("Third element");
        System.out.println("queue.peek() = " + queue.peek());
        System.out.println("queue = " + queue);
        queue.poll();
        System.out.println("queue = " + queue);
    }
}
