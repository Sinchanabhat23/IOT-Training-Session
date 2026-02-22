package parent;
public class Parent {
int x=10;
void print()
{
    System.out.println("Parent");
}
}
class child extends Parent{
int x=20;
void show()
{
    super.print();
    System.out.println(x);
    System.out.println(super.x);
}
   public static void main(String[] args) {
   child c=new child();
   c.show();
    }
} 