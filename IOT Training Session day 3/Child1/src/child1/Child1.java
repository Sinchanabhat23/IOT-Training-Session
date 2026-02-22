package child1;
class Parent
{
    void eat()
    {
        System.out.println("parent eats");
    }
}
public class Child1 extends Parent
{
    void eat()
    {
        System.out.println("Child1 eats");
    }
    void display()
    {
        eat();
       super.eat();
    }
    public static void main(String[]args)
    {
       Child1 c=new Child1();
        c.display();
    }
}