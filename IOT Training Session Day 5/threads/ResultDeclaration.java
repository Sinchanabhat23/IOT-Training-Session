package threads;
import java.util.concurrent.ExecutionException;
public class ResultDeclaration {
    synchronized void declareResult() throws Exception{
        System.out.println("Waiting for approval");
        wait();
        System.out.println("Result Declared");
    }
    synchronized void approve(){
        notify();
    }
    public static void main(String[] args) throws Exception{
        ResultDeclaration t1=new ResultDeclaration();
        new Thread(()->{
                    try{
                        t1.declareResult();
                    }catch(Exception e){}
                }).start();
        Thread.sleep(2000);
        new Thread(()->
            t1.approve()).start();
    }
}
/* the declareResult()method waits until another thread calls
notify() during wait() the thread releases the lack, allowing other threads to enter the synchronized code
sleep()->time based
wait()->condition based
wait()->release lock->by checking the notify() method
wait()->is used in inter threaded communication
order-placed->Preparing->prepared->delivery->delivered
 */