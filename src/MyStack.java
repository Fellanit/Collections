import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<String> hobbies = new Stack<>();
        hobbies.push("play BasketBall"); // .push == .add
        hobbies.push("take a photo");
        hobbies.push("sing");
        System.out.println("hobbies = " + hobbies);
        hobbies.peek();
        System.out.println("hobbies.get(0) = " + hobbies.get(1));
        System.out.println("hobbies.size() = " + hobbies.size());
        System.out.println("hobbies.pop() = " + hobbies.pop());
        System.out.println("hobbies.remove(0) = " + hobbies.remove(0));
        System.out.println("hobbies.size() = " + hobbies.size());
        hobbies.clear();
        hobbies.push("Dance");
        System.out.println("hobbies = " + hobbies);
        System.out.println("hobbies.removeAll(hobbies) = " + hobbies.removeAll(hobbies));

    }
}
