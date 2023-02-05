import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {
    public static void main(String[] args) {
        List<String> juises = new LinkedList<>();
        juises.add("Sandora");
        juises.add("Rauch");
        System.out.println("juises.get(1) = " + juises.get(1));
        System.out.println("juises.size() = " + juises.size());
        juises.remove(0);
        System.out.println("juises = " + juises);
        juises.clear();
        System.out.println("juises = " + juises);
    }
}
