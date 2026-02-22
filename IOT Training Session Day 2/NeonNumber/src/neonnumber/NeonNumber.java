package neonnumber;
import java.util.*;
public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int square = n * n;
        int sum = 0;
        while (square != 0) {
            int d = square % 10;   
            sum = sum + d;         
            square = square / 10;  
        }
        if (sum == n) {
            System.out.println("Neon number");
        } else {
            System.out.println("Not a neon number");
        }
    }
}
