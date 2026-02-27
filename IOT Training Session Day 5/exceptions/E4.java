package exceptions;
import java.io.*;
public class E4 {
    public static void main(String[] args) throws IOException {
        String str;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            System.out.println("Enter any data");
            str = br.readLine();
            System.out.println(str);
            br.close(); //not needed bcz it is autoclosable
        }
    }
}

