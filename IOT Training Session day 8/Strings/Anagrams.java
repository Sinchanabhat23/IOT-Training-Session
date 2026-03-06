package Strings;

import java.util.Arrays;

public class Anagrams { // SILENT LISTEN
    public static void main(String[] args) {
        String str1 = "SILENT";
        String str2 = "LISTEN";
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        if(Arrays.equals(arr1,arr2)){
            System.out.println("Anagrams");
        }
        else{
            System.out.println("Not Anagrams");
        }
    }
}
