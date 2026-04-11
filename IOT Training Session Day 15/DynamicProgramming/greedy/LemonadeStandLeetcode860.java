package DynamicProgramming.greedy;

import java.util.Arrays;
import java.util.List;

public class LemonadeStandLeetcode860 {
    public static boolean lemonadeChange(List<Integer> bills) {
        int five = 0;
        int ten = 0;
        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five == 0) return false;
                five--;
                ten++;
            } else { // 20 rupees
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true; // all customers were given exact change
    }
    public static void main(String[] args) {
        List<Integer> bills1= Arrays.asList(5,5,5,10,20); // true
        List<Integer> bills2= Arrays.asList(5,5,10,10,20); //false
        System.out.println("Bills1:"+lemonadeChange(bills1));
        System.out.println("Bills2:"+lemonadeChange(bills2));
    }
}
