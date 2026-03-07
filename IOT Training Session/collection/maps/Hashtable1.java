package DSA.collection.maps;

import java.util.Hashtable;

public class Hashtable1 {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(106, "Sharanya");
        ht.put(117, "Sinchana");
        ht.put(128, "Raam");
        ht.put(100, "Tejuu");
        ht.put(99, "Devii");
        ht.put(101, "Shyam");
        System.out.println(ht.getOrDefault(106, "Not found")); // 106 is there so it returns Sharanya
        System.out.println(ht.getOrDefault(200, "Not found")); // 200 isn't there so it tells Not Found
        ht.putIfAbsent(104, "Gourav");
        System.out.println("Updated table:" + ht);
        ht.putIfAbsent(99, "Devii");
        System.out.println("Updated table:" + ht);
    }
}
