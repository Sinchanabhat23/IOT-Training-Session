package DSA.Algorithms.searching;

public class RecursiveBinarySearch {
    public static int recursiveBinarySearch(int[] arr, int key, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - 1) / 2;
        if (arr[mid] == key) {
            return mid;
        } else if (arr[mid] < key) {
            return recursiveBinarySearch(arr, key, mid + 1, e);
        } else if (arr[mid] > key) {
            return recursiveBinarySearch(arr, key, mid - 1, e);
        }
        return -1;
    }
        public static void main (String args[])
        {
            int arr[] = {1, 23, 39, 45, 78};
            int key = 23;
            int result = recursiveBinarySearch(arr, 23, 0, arr.length - 1);
            System.out.println("Element " + key + " found at position " + result);
        }
    }

