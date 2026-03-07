package DSA.bitmanipulation;

import java.util.Scanner;

public class MultiplyByTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int result=n<<1; // left shift
        System.out.println(result);

        // divide by 2
        int result1=n>>1; // right shift
        System.out.println(result1);
    }
}
