package deadlock;

public class ThreadWithPriority extends Thread{
public void run(){
    for(int i=1;i<=3;i++)
    {
        System.out.println(Thread.currentThread().getName()+"|Priority:"+Thread.currentThread().getPriority());
    }
}
public static void main(String[]args)
{
    ThreadWithPriority t1=new ThreadWithPriority();
     ThreadWithPriority t2=new ThreadWithPriority();
     Thread t3=new ThreadWithPriority();
     t1.setName("Low priority thread");
     t2.setName("Medium priority thread");
     t3.setName("High priority thread");
     t1.setPriority(Thread.MIN_PRIORITY);
     t2.setPriority(Thread.NORM_PRIORITY);
     t3.setPriority(Thread.MAX_PRIORITY);
     t3.setPriority(10);
     t1.start();
     t2.start();
     t3.start();
  }
}
/* POINTS TO REMEMBER
Thread priority is only a suggestion to the JVM or the scheduler.
Higher priority doesn't guarantee execution order
Higher priority threads may get more CPU Scheduler time
The actual behaviour depends on the JVM and operating system
 */