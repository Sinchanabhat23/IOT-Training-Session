package animal1;
public class Animal1 {
    void walk()
    {
    System.out.println("animal walks");
  }
}
class Dog extends Animal1
{
    void bark()
    {
        System.out.println("Dog barks");
}
    }
class Puppy extends Dog
{
    void jump()
    {
        System.out.println("Puppy jumps");
}
    public static void main(String[] args) {
        Puppy p=new Puppy();
        p.walk();
        p.bark();
        p.jump();
    }
}
    