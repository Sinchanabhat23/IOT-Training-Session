package strongnumber;
import java.util.*;
public class Strongnumber {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int original=n;
       int sum=0;
       while(n>0)
       {
       int digit=n%10;
       int fact=1;
       for(int i=1;i<=digit;i++)
       {
       fact=fact*i;
       }
       sum=sum + fact;
       n=n/10;
       }
       if(sum==original)
       {
           System.out.println("The number is strong number");
       }
       else
       {
           System.out.println("the number is not strong  number");
       }
    }
}

        