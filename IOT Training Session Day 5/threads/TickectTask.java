package threads;

public class TickectTask implements Runnable{
    String task;
    TickectTask(String task){
        this.task=task;
    }
    public void run()
    {
        System.out.println(task+"in progress");
    }
    public static void main(String[]args){
        Thread t1=new Thread(new TickectTask("Seat Assignment"));
        Thread t2=new Thread(new TickectTask("Payment Processing"));
        Thread t3=new Thread(new TickectTask("SMS Notification"));
        t1.start();
        t2.start();
        t3.start();
    }
}
