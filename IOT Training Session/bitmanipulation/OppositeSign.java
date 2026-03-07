package DSA.bitmanipulation;

import java.util.Scanner;

public class OppositeSign {
    public static void main(String[] args) {
        System.out.print("Enter a first number:");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        System.out.print("Enter a second number:");
        int b=sc.nextInt();
        if((a^b)<0)
        {
            System.out.println("Opposite sign");
        }
        else {
            System.out.println("Same sign");
        }
    }
}
