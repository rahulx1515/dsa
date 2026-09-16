import java.util.*;
public class HashMapDemo {
    public static void main(String[] args) {

        //order doesn't matter and null is allowed
        HashMap<String , Integer> map = new HashMap<>();
        map.put("Ankit", 1);
        map.put("Raj", 2);    
        map.put("Manish", 3);
        map.put("Ankita", 3);
        map.put("Shiva", 3);
        map.put("Pooja", 3);
        map.put(null, 55);
        System.out.println(map);
        //get
        System.out.println(map.get("Ankit"));
        System.out.println(map.get("Raj"));
        //containsKey
        System.out.println(map.containsKey("Ankit"));
        System.out.println(map.containsKey("D"));
        //remove
        System.out.println(map.remove("Ankit"));
        System.out.println(map.remove("Raj"));
        System.out.println(map);

        // order doesn't matter and null is not allowed
        TreeMap<String , Integer> map1 = new TreeMap<>();
        map1.put("Ankit", 1);
        map1.put("Raj", 2);
        map1.put("Manish", 3);
        map1.put("Ankita", 4);
        map1.put("Shiva", 5);
        map1.put("Pooja", 3);
        // map1.put(null, 55);
        System.out.println(map1);

        // here also matters and null is allowed
        LinkedHashMap<String , Integer> map2 = new LinkedHashMap<>();
        map2.put("Ankit", 1);
        map2.put("Raj", 2);
        map2.put("Manish", 3);
        map2.put("Ankita", 4);
        map2.put("Shiva", 5);
        map2.put("Pooja", 3);
        map2.put(null, 55);
        System.out.println(map2);
    }
}