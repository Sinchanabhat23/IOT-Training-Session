package automorphicnumber;
import java.util.*;
public class Automorphicnumber {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number");
       int n=sc.nextInt();
       int Square=n*n;
             while(n>0)
       {
           if(n%10!=Square%10)
           {
               System.out.println("It is not automorphic number "+n);
               return;
           }
           n=n/10;
           Square=Square/10;
       }
       System.out.println("It is automorphic number");
    }
    }

