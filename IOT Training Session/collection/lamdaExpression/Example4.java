package DSA.collection.lamdaExpression;
import java.util.*;
// Java StreamAPI -Java 8
public class Example4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(3);
        list.add(1);
        list.forEach(n->System.out.println(n)); // Lamda
        list.forEach(System.out::println); // STREAM API JAVA 8
    }
}
// :: streams
// -> Lamda