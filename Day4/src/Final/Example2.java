package Final;

public class Example2 {

    final int x;
    static final int y;

    static
    {
        y = 10;
        System.out.println("start");
        System.out.println("DB Start");
        System.out.println("Internet start");
        System.out.println("Load files");
    }

    {
        System.out.println("IIB2");
    }

    Example2()
    {
        x = 200;
    }

    public static void main(String[] args)
    {
        Example2 obj = new Example2();
    }
}