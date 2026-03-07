package DSA.collection.maps;

import java.util.Hashtable;
import java.util.Map;

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht=new Hashtable<>();
        ht.put(106,"Sharanya");
        ht.put(117,"Sinchana");
        ht.put(128,"Raam");
        ht.put(100,"Tejuu");
        ht.put(99,"Devii");
        ht.put(101,"Shyam");
        ht.put(103,"Pramod");
        for(Map.Entry<Integer,String> entry:ht.entrySet()){
            System.out.println(entry.getKey()+" , "+entry.getValue());
        }
        ht.remove(103);
        System.out.println(ht);
    }
}
// Null keys are not allowed.....null values are allowed