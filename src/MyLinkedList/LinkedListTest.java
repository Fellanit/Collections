package MyLinkedList;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> linkedTest = new MyLinkedList<String>();
        linkedTest.addLast("Bobo");
        linkedTest.addLast("Abobo");
        linkedTest.addLast("Bobojan");
        linkedTest.addFirst("Bobo father");
        System.out.println("linkedTest.size() = " + linkedTest.size());
//        System.out.println("linkedTest.remove(1) = " + linkedTest.remove(1));
        System.out.println("linkedTest.size() = " + linkedTest.size());
        System.out.println("linkedTest.get(2) = " + linkedTest.get(2));
        linkedTest.clear();
        System.out.println("linkedTest.size() = " + linkedTest.size());


    }
}
