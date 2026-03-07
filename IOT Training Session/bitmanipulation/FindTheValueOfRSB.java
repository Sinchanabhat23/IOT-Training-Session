package DSA.bitmanipulation;

public class FindTheValueOfRSB {
    public static void main(String[] args) {
        int n=12;
        int result=n&-n;
        System.out.println("Rightmost set bit value:"+result);
    }
}
