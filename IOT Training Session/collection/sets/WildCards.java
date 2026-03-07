package DSA.collection.sets;
import java.util.*;
public class WildCards {
    public static void printList(List<?> list) {
        for (Object o : list) {
            System.out.println(o + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("I");
        strings.add("AM");
        strings.add("A");
        strings.add("Good");
        strings.add("Student");
        printList(strings);
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
       printList(integers);
    }
}

