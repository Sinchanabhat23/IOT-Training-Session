package DSA.collection.HashSet;

import java.util.Collections;
import java.util.TreeSet;
import java.util.Set;
public class LeaderBoard {
    public static void main(String[] args) {
        Set<Integer> scores=new TreeSet<>(Collections.reverseOrder());
        scores.add(200);
        scores.add(274);
        scores.add(113);
        scores.add(94);
        scores.add(500);
        scores.add(90);
        System.out.println("Leader board score is:"+scores);
    }
}
// Maintains ascending order