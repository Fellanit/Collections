import java.util.ArrayList;
import java.util.List;

public class MyArrayList {
    public static void main(String[] args) {
        List<String> schoolmates = new ArrayList<String>();
        schoolmates.add("Simon");
        schoolmates.add("Pumba");
        schoolmates.add("Krip Stepan");
        System.out.println("schoolmates = " + schoolmates);
        System.out.println("schoolmates.remove(2) = " + schoolmates.remove(2));
        System.out.println("schoolmates.size() = " + schoolmates.size());
        System.out.println("schoolmates.get(1) = " + schoolmates.get(1));
        System.out.println(schoolmates);
        schoolmates.clear();
    System.out.println("schoolmates = " + schoolmates);;
    }

}