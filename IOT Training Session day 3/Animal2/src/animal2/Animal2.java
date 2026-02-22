package animal2;
public class Animal2 {
void Walk()
{
    System.out.println("Animal walks");
}
}
class Cat extends Animal2
{
    void Jump()
    {
        System.out.println("Cat jumps");
       }
    }
class Dog extends Animal2
{
    void Runs()
    {
        System.out.println("Dog runs");
}
public static void main(String[] args) {
     Dog d=new Dog();
     Cat c=new Cat();
     c.Walk();
     c.Jump();
     d.Walk();
     d.Runs();
      }
    }


