package DSA.collection;

public class Printer<T>{
    T data;
    Printer(T data){
        this.data = data;
    }
    void printValue(){
        System.out.println("Data: "+data);
    }
    public static void main(String[] args) {
        Printer <Integer> integerPrinter = new Printer<Integer>(1);
        Printer<String> stringPrinter = new Printer<String>("Honnavara");
        Printer<Boolean> booleanPrinter = new Printer<Boolean>(true);
        Printer<Float> floatPrinter = new Printer<Float>(1.45f);
        Printer<Double> doublePrinter = new Printer<Double>(1.456);
        integerPrinter.printValue();
        stringPrinter.printValue();
        booleanPrinter.printValue();
        floatPrinter.printValue();
        doublePrinter.printValue();
    }
}
/* Before Generics existed (pre-Java 5), if you wanted a class that could print an Integer,
 a String, and a Double, you would either have to write five different classes
  or use the Object class, which required risky manual type-casting.
  Generics allow you to write one class that works with any data type safely.
 */
