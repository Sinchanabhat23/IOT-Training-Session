package DSA.Algorithms.searching;

public class LinearSearch {
    static int linearSearch(int[]arr,int target)
    {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
            {
                return i; // to return index
            }
        }
        return -1;  // if not found return -1
    }
    public static void main(String[] args){
        int[]arr=new int[]{10,52,0,8,1,3};
        System.out.println (linearSearch(arr,52));
    }
}
