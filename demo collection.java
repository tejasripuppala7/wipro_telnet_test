import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {

        // 1. ArrayList - ordered, allows duplicates
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");  // duplicates allowed

        System.out.println("ArrayList: " + list);

        // 2. HashSet - unordered, no duplicates
        Set<String> set = new HashSet<>();
        set.add("Cat");
        set.add("Dog");
        set.add("Cat");  // duplicate ignored

        System.out.println("HashSet: " + set);

        // 3. HashMap - key-value pairs
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(1, "Uno");  // key 1 is updated

        System.out.println("HashMa
