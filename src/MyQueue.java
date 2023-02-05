import java.util.ArrayDeque;
import java.util.Queue;

public class MyQueue {
    public static void main(String[] args) {
        Queue<String> names = new ArrayDeque<>();
        names.add("Billi");
        names.add("Antony");
        names.add("Richard");
        System.out.println("names.size() = " + names.size());
        System.out.println("names.poll() = " + names.poll());
        System.out.println("names.peek() = " + names.peek());
        names.clear();
    }
}
