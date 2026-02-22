package animall;
public class Animall {
    void sound()
    {
        System.out.println("animas makes sound");
    }
}
class Dog extends Animall
{
    void sound()
    {
        System.out.println("Dog barks");
    }
    public static void main(String[] args) {
       Animall an=new Dog();
       an.sound();
    } 
}
