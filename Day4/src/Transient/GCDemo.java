package Transient;

public class GCDemo {
    public static void main(String[] args){
        GCDemo obj = new GCDemo();
        obj=null;
        System.gc();
    // Nowadays the gc method is automatically invoked after program execution by the object class for clutter,garbage collection and removal by the JVM we do not need to call it explicitly
        System.out.println("GC Requested!!");
    }
}
