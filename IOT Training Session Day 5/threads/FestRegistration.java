package threads;

public class FestRegistration {
    static class FormFilling extends Thread{
        public void run()
        {
            System.out.println("Form filling started!");
        }
    }
    static class DocumentUpload extends Thread{
        public void run()
        {
            System.out.println("Document upload started!");
        }
    }
    static class EmailNotification extends Thread{
        public void run()
        {
            System.out.println("Email notification sent!");
        }
    }
    public static void main(String[] args)
    {
        FormFilling t1= new FormFilling();
        DocumentUpload t2 = new DocumentUpload();
        EmailNotification t3= new EmailNotification();
        t1.start();
        t2.start();
        t3.start();
    }
}
/* Method to start the thread is .start();
threads allow parallel execution
output order is not guaranteed
threads share the same memory
improves the performance and responsiveness
when start() is called,the JVM creates a new thread
when run() is called directly, there is no concurrency
 */
