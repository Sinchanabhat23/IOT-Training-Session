package arrayproblems;

import java.util.Arrays;

public class PartitionArray {
    public static void main(String[] args) {
        int[] arr = {3, 8, 5, 12, 7, 6};
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            while(arr[left]%2==0)
            {             //if left has even numbers move left
                left++;
            }
            while(arr[right]%2!=0)
            {             // if right has odd number move right
                right--;
            }
            if(left<right)
            {                    // if number is not in correct position do swap
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
        // same as for(int x:arr)
        //System.out.println(x+" ");
    }
}
