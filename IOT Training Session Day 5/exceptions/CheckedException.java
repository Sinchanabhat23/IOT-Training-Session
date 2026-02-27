package exceptions;

import java.io.IOException; // fully qualifed class name
public class CheckedException {
    static void readFile()throws IOException //if u know abt what exception
    {
        throw new IOException("File Not Found");
    }
    public static void main(String[] args)
    {
        try{
        display();
    }catch(IOException e) {
            System.out.println(e.getMessage());
           }
        }
    static void display() throws IOException
    {
        readFile();
    }
}
/* java.io.IOException Fully qualified class name
for checked exceptions we always use try catch block
the throws keyword doesnt handle to the calling method
the calling method has to handle the exception
the throws keyword is written in th method signature name
 */