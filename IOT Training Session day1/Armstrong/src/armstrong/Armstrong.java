package armstrong;
import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int temp = n;     
        int count = 0;
        while(n != 0)
        {
            count++;
            n = n / 10;
        }
        int m = 0;
        int temp2 = temp;
        while(temp2 != 0)
        {
            int digit = temp2 % 10;
            m = m + (int)Math.pow(digit, count);
            temp2 = temp2 / 10;
        }
        if(temp == m)
        {
            System.out.println("It is Armstrong number");
        }
        else
        {
            System.out.println("It is not an Armstrong number");
        }
    }
}
 