package threads;

public class SleepExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Printing 0-9");
        for(int i=0;i<10;i++)
        {
            System.out.println("Printed:"+i);
            Thread.sleep(2000);
        }
        System.out.println("Done");
    }
}
/* here,the thread is paused for a fixed duration time
the thread doesnt lock anything and resumes after the given time
 */