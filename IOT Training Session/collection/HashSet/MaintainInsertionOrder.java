package DSA.collection.HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class MaintainInsertionOrder {
    public static void main(String[] args) {
        HashSet<Integer>set=new LinkedHashSet<>();
        set.add(2);
        set.add(4);
        set.add(6);
        set.add(7);
        set.add(1);
        set.add(2);
        System.out.println(set);
    }
}
// LinkedHashSet maintains insertion order
// Hashset doesnt maintain insertion order
