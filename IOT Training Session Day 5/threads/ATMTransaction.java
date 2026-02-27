package threads;

public class ATMTransaction extends Thread{
    public void run()
    {
        System.out.println("Processing ATM Transaction");
    }
    public static void main(String[] args)
    {
        ATMTransaction t = new ATMTransaction();
    System.out.println("Thread state:"+t.getState()); //new
    t.start();
    System.out.println("Thread state after start:"+t.getState()); //runnable
    }
}
/* points to remember
initially thread is in the new state after calling start(),it moves to runnable and executes the run() method.
the exact timing of the state changes depends on the JVM Scheduler
>thread is created once
>start() changes state
>state cannot be restarted
final state is terminated or dead
 */