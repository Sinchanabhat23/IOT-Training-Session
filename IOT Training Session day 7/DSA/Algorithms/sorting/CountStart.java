package DSA.Algorithms.sorting;

import java.util.Arrays;

public class CountStart {
    public static void countSort(int[] arr)
    {
        // find the max
        int k=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>k)
            {
                k=arr[i];
            }
        }
        // create a count array [0-MAX]
        int[] count=new int[k+1];
        // calculate the freq of each element in the array
        for(int i=0;i<arr.length;i++) {
            count[arr[i]]++;
        }
        // Step 4: Calculate the cumulative frequency
        for(int i=1;i<=k;i++)
        {
            count[i]+=count[i-1];
        }
        //step 5 create the output array
        int [] output=new int[arr.length];
      // Start from the end of the array(L<-R)
       for(int i=arr.length-1;i>=0;i--) {
           output[--count[arr[i]]] = arr[i];
         }
       // copy the output back into the input
        System.arraycopy(output,0,arr,0,arr.length);
       }
    public static void main(String[] args) {
        int[]arr={2,3,4,6,7,9,10,23,5};
        System.out.println(Arrays.toString(arr));
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
