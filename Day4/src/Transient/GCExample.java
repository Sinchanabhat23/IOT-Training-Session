package Transient;

public class GCExample {
    public static void main(String[] args) {
        String s1=new String("Java");
        String s2=new String("Python");
        s2=s1;
        System.gc(); //not mandatory
        //now in the string pool,java is not available
        //that proves that garbage collection is automatic
        System.out.println(s1);
    }
}
