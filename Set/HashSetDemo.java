import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        // order doesn't matter and null is allowed
        HashSet<String> set = new HashSet<>();
        set.add("Ankit");
        set.add("Raj");
        set.add("Manish");
        set.add("Ankita");
        set.add("Shiva");
        set.add("Pooja");
        set.add(null);
        System.out.println(set);
        // contains
        System.out.println(set.contains("Ankit"));
        System.out.println(set.contains("D"));
        // remove
        System.out.println(set.remove("Ankit"));
        System.out.println(set.remove("Raj"));
        System.out.println(set);

        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);
        System.out.println(set1);

        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
        set2.add(10);
        set2.add(20);
        set2.add(30);   
        System.out.println(set2);

        //loops
        Set<String> s = new HashSet<>();
        for(String x: set){
            System.out.println(x+ " ");
        }
        for(String x: map.keySet()){
            System.out.println(x+ " "+map.get(x));
        }
        System.out.println();

    }
}
