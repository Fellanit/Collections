package Module_9.MyStack;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack<Integer> stackTest = new MyStack<Integer>();
        stackTest.push(12);
        System.out.println("stackTest = " + stackTest);
        stackTest.push(11);
        System.out.println("stackTest = " + stackTest);
        stackTest.push(16);
        System.out.println("stackTest = " + stackTest);
        stackTest.push(18);
        System.out.println("stackTest = " + stackTest);
        System.out.println("stackTest.size() = " + stackTest.size());
        System.out.println("stackTest.peek() = " + stackTest.peek());
        System.out.println("stackTest = " + stackTest);
        System.out.println("stackTest.size() = " + stackTest.size());
        System.out.println("stackTest.pop() = " + stackTest.pop());
        System.out.println("stackTest = " + stackTest);
    }
}
