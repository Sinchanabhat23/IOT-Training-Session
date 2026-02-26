package Strings;

public class StringPool {
    public static void main(String[] args) {
        String s1="Java";
        String s2="Java";
        String s3=new String("Java");
        System.out.println(s1==s2);
        System.out.println(s1==s3);//checks location
        System.out.println(s1.equals(s3)); //checks values
    }
}
/*s1 and s2 share same object in pool
new object is created in  heap memory
 */
