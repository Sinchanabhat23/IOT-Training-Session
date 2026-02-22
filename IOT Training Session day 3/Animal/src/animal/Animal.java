package animal;
class pet
{
    void print()
    {
        System.out.println("Sound");
    }
}
class Cat extends pet
        {
    void Sound()
    {
       System.out.println("Meow");
    }
}
public class Animal
{
    public static void main(String[]args)
    {
        Cat c=new Cat();
        c.Sound();
        c.print();
    }
}