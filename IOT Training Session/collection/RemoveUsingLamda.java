package DSA.collection;

import java.util.ArrayList;
import java.util.Iterator;
public class RemoveUsingLamda {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(16);
        list.add(22);
        list.add(39);
        list.add(42);
        list.add(54);
        list.add(65);
        list.add(73);
        System.out.println("Before:" + list);
        list.removeIf(n -> n % 2 == 0); // removes even numbers using lamda expression
        System.out.println("After:" + list);
    }
}