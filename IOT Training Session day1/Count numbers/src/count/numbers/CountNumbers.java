
package count.numbers;
import java.util.Scanner;
public class CountNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
int n=sc.nextInt();
int count=0;
if(n==0)
{
    System.out.println("number of digits="+1);
}
else
{
    while(n!=0)
    {
        count++;
        n=n/10;
    }
    System.out.println("Count of number is="+count);
}
    }
}