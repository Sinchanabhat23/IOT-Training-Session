package vehicle;
 public class Vehicle {
    void speed()
    {
        System.out.println("Vehicle speed is suinn");
    }
     void speed(int maxSpeed)
    {
        System.out.println("Maximum speed of vehichle is "+ maxSpeed);
    }
 static class Car extends Vehicle
{
    void speed(String mode)
    {
        System.out.println("Driving mode of car is"+ mode);
    }
 }
    public static void main(String[] args) {
       Car c=new Car();
       c.speed();
       c.speed(100);
       c.speed("mode");
           }
        }
