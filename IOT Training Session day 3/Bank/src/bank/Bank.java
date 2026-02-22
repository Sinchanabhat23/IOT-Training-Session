package bank;
public class Bank {
void interest()
{
    System.out.println("Bank provides interest on deposits");
}   
   void interest(double rate)
   {
       System.out.println("Interest rate is"+rate);
   }
  static class SBI extends Bank
   {
      void interest(double rate,double time){
       double principal=1000;
       double totalInterest=(principal*rate*time)/100;
           System.out.println("total interest is"+ totalInterest);
          }
       }
    public static void main(String[] args) {
        SBI s=new SBI();
        s.interest();
        s.interest(12.5);
        s.interest(13.5,3.0);
    }
}
