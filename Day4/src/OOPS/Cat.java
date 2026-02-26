package OOPS;

public interface Cat {
default void sound()
{
    System.out.println("Meow");
}
}
interface Dog{
    default void sound()
    {
        System.out.println("Woof");
    }
}
class Cog implements Cat,Dog{
    @Override
    public void sound() {
        System.out.println("Some sound");
        Cat.super.sound();
        Dog.super.sound();
    }
}
class Demo
{
    public static void main(String[]args)
    {
        Cog c=new Cog();
        c.sound();
    }
}
