package NestedClasses;
public interface Payment {
    void pay();
}
class PaymentDemo {
    public static void main(String[] args) {
        Payment p=new Payment()
        {
            public void pay()
            {
                System.out.println("Payment done using credit card");
            }
        };
        p.pay();
        //SCALA-java 8(Steams,annotations,lambdas,reflection)
        Payment p1=()->System.out.println("Cash Payment");
        p1.pay();
    }
}
/* POINTS TO REMEMBER
One time implementation
No need to create separate class
It is used in events and call back functions*****
 */
