package DSA.collection.maps;

import java.util.TreeMap;

public class TreemapExample {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<Integer,String>();
        map.put(3,"C");
        map.put(5,"A");
        map.put(4,"B");
        System.out.println(map);
    }
}
