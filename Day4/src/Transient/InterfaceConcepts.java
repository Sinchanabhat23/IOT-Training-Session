package Transient;
interface InterfaceConcepts
{
    void display();
    }
    class A
        {
    }
    class B {
        public static void main(String[] args) {
            A a=new A();
            B b=new B();
            InterfaceConcepts obj=new InterfaceConcepts()
            {
                public void display()
                {
                    System.out.println("Hello");
                }
        };
            InterfaceConcepts obj1=()->System.out.println("Hello");
    }
}
