package Strings;

public class StringBuilderExample {

    public void stringInsert() {
        StringBuilder builder = new StringBuilder("RAAAM");
        System.out.println("Old String:" + builder);
        builder.insert(1, "AV");
        System.out.println("New String:" + builder);
    }

    public void stringAppend() {
        StringBuilder builder = new StringBuilder("SNPSU");
        System.out.println("Old String:" + builder);
        builder.append("ISE");
        System.out.println("New String:" + builder);
    }

    public void stringReverse() {
        StringBuilder builder = new StringBuilder("SINCHANA");
        System.out.println("Old String:" + builder);
        builder.reverse();
        System.out.println("New String:" + builder);
    }

    public static void main(String[] args) {
        StringBuilderExample obj = new StringBuilderExample();
        obj.stringInsert();
        obj.stringAppend();
        obj.stringReverse();
    }
}