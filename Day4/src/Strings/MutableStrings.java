package Strings;

public class MutableStrings {
    public static void main(String[] args) {
        /*String s="SNPSU";
        s+="ISE";
        System.out.println("String:"+s); we can do but not recommended
       //Mutable and thread safe
         */
        StringBuffer buffer = new StringBuffer("SNPSU");
        buffer.append("ISE");
        System.out.println(buffer);
        //Mutable and not thread safe
        StringBuilder builder = new StringBuilder("SNPSU");
        builder.append("ISE");
        System.out.println(builder);
    }
}