package palindrome;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int original=n;
        int rev=0;
        while(n!=0)
        {
        int d=n%10;
        rev=rev*10+d;
        n=n/10;
        }
        if(rev==original)
        {
            System.out.println("The number is palindrome");
    } else
        {
                System.out.println("The number isnt palindrome");
                }
    }
}
