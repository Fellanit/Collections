package Modul_9.MyArrayList;

public class ArrayTest {
    public static void main(String[] args) {
        MyArrayList<Integer> array12 = new MyArrayList<>();
        array12.add(21);
        array12.add(13);
        array12.add(12);
        array12.add(15);
        array12.add(143);
        array12.add(14324);
        array12.add(12321);
        array12.add(1432);
        array12.add(133);
        array12.add(1222);
        array12.add(1224);
        System.out.println("array12 = " + array12);
        System.out.println("array12.remove(3) = " + array12.remove(3));
        System.out.println("array12.get(7) = " + array12.get(7));
        array12.clear();
        System.out.println("array12.size() = " + array12.size());


    }
}
