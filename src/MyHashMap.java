import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    public static void main(String[] args) {
        Map<String,Integer> seasons = new HashMap();
        seasons.put("Winter", 1);
        seasons.put("Spring", 2);
        seasons.put("Summer", 3);
        seasons.put("Fall", 4);
        System.out.println("seasons = " + seasons);
        System.out.println("seasons.size() = " + seasons.size());
        System.out.println("seasons.get(\"Summer\") = " + seasons.get("Summer"));
        System.out.println("seasons.remove(\"Fall\") = " + seasons.remove("Fall"));
        System.out.println("seasons.keySet() = " + seasons.keySet());
        System.out.println("seasons.values() = " + seasons.values());
        System.out.println("seasons.containsKey(\"Winter\") = " + seasons.containsKey("Winter"));
        System.out.println("seasons.containsKey(\"Autumn\") = " + seasons.containsKey("Autumn"));
        seasons.clear();
    }
}
