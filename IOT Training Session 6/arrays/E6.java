package arrays;
// Varargs-> ... {It internally uses arrays}
public class E6 {
    public static void display(int... arr) {
        for(int num:arr)
        {
            System.out.println(num+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        display(arr);
    }
}
