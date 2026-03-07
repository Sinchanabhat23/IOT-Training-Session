package DSA.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaIterator {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList <Integer>();
        list.add(16);
        list.add(22);
        list.add(39);
        list.add(42);
        list.add(54);
        list.add(65);
        list.add(73);
        Iterator<Integer> it=list.iterator();
    // Remove the elements which is greater thn 45
        while(it.hasNext()){
            Integer i=it.next();
            if(i>45)
            {
                it.remove();
            }
        }
        System.out.println(list);
    }
}
