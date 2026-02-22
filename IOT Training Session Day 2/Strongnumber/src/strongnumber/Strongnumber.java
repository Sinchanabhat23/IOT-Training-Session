package strongnumber;
import java.util.*;
public class Strongnumber {
    int factorial(int d)
    {
        int fact=1;
        for(int i=1;i<=d;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    boolean isStrong(int n)
    {
        int temp=n;
        int sum=0;
        while(n>0)
        {
          int d=n%10;
          sum=sum+factorial(d);
          n=n/10;            
        }
    if(sum==temp)
    {
       return true;
    }
    else
    {
       return false;
    }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
       Strongnumber sn=new Strongnumber();
       if(sn.isStrong(n))
       {
           System.out.println("it is strong number");
       }
       else
       {
           System.out.println("it is not strong number");
       }
    }
}
