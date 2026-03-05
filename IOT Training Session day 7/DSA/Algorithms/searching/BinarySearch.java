package DSA.Algorithms.searching;
public class BinarySearch {
static int binarySearch(int[]arr,int key) {
    int s = 0;
    int e = arr.length - 1;
    while (s < e) {
        int mid = s + (e - 1) / 2;
        if (arr[mid] == key) {
            return mid;
        } else if (arr[mid] < key) {
            s = mid + 1;
        } else {
            e = mid - 1;
        }
    }
    return -1;
}
    public static void main(String args[])
    {
        int[] arr={2,3,5,6,9,15};
        System.out.println(binarySearch(arr,5)); //binarySearch is a method
    }
}
/* public static void main(String[] args)
{
int[] arr={2,3,5,6,9,15};
int key=5;
int index=binarySearch(arr,key)
{

 */