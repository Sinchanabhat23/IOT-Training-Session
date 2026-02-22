package binaryd2;
public class BinaryD2 {
    public static int no_of_bits(int n)
    {
        int count=0;
        while(n>0){
            if((n&1)==1)
            {
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        int result=no_of_bits(4);
        System.out.println(result);
    }    
}
