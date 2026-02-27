package exceptions;

public class E2 {
    // multicatchblock
    public static void main(String[] args) {
        int i,j,k=0;
        i=10;
        j=0;
        try{
            k=i/j;
            int[]arr={1,2,3,4,5};
            System.out.println(arr[9]);
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}//even though Exception is the class of all the exception we dont get op for second wrong code bcz it never goes to it so it throws only one exception
