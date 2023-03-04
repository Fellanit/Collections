package Modul_9.MyHashMap;

public class MyHashMapTest {
    public static void main(String[] args) {
        MyHashMap<String,Integer> workerSalary = new MyHashMap<String, Integer>();
        workerSalary.put("Oleg",1500);
        workerSalary.put("Maxim",2100);
        workerSalary.put("Tatiana",800);
        workerSalary.put("Nora",1800);


        System.out.println("workerSalary.get(\"Oleg\") = " + workerSalary.get("Oleg"));
        System.out.println("workerSalary.get(\"Tatiana\") = " + workerSalary.get("Tatiana"));
        System.out.println("workerSalary.get(\"Nora\") = " + workerSalary.get("Nora"));
       for (int i = 0; i < 100; i++) {
            workerSalary.put("" + i,i);
       }
      System.out.println("workerSalary.remove(\"Maxim\") = " + workerSalary.remove("Maxim"));
        workerSalary.display();
        System.out.println("workerSalary.size() = " + workerSalary.size());
    }
}
