package calculator;
public class Calculator {
    static void calci(int a,int b)
    {
        System.out.println(a+b);
    }
    static void calci(double a,double b)
    {
        System.out.println(a*b);
    }
    public static void main(String[] args) {
        calci(9,8);
        calci(8.9,6.7);
        
    }
}
