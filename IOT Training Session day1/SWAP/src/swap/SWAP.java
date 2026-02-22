package swap;
public class SWAP {
    public static void main(String[] args) {
        int a=2;
        int b=3;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("Number after swaping a is="+a+"\n Number after swaping b is="+b);
    }
    
}
