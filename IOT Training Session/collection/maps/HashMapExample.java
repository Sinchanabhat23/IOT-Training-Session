package DSA.collection.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class HashMapExample {
    public static void main(String[] args) {
        Map<String, String> hashmap = new HashMap<>();
        hashmap.put("01", "aaa");
        hashmap.put("03", "bbb");
        hashmap.put("05", "ccc");
        hashmap.put("02", "ddd");
        hashmap.put("09", "eee");
        for (Map.Entry<String, String> entry : hashmap.entrySet()) {
            System.out.println(entry.getKey() + " , " + entry.getValue());
        }
        Map<String, String> hashmap1 = new LinkedHashMap<>();
        hashmap1.put("01", "aaa");
        hashmap1.put("03", "bbb");
        hashmap1.put("05", "ccc");
        hashmap1.put("02", "ddd");
        hashmap1.put("09", "eee");
        for (Map.Entry<String, String> entry : hashmap1.entrySet()) {
            System.out.println(entry.getKey() + " , " + entry.getValue());
        }
    }
}
// LinkedHashMap maintains insertion order
// Where