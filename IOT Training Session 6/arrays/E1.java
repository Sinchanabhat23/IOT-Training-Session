package arrays;
public class E1 {
    public static void main(String[] args) {
        int[] arr1;
        arr1 = new int[5];
        int[] arr2 = new int[5];
        System.out.println(arr2[4]);
        System.out.println(arr2[3]);
        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4 = new int[]{1, 2, 3, 4, 5};
    }
}
/* memory allocation [20 bytes]
declaration + memory allocation in single line
if we dont provide value
the jvm uses "Fallback Mechanism"
it uses the default value of that data type
method 2
 */
