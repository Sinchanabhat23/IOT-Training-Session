package exceptions;

import java.io.IOException;

public class Demo {
    public static void main(String[] args) {
        try {
            int balance = 2000;
            int withdraw = 3000;
            if (withdraw > balance) {
                throw new ArithmeticException("Insufficient Funds");
            }
                System.out.println("withdraw-successfull");
        } catch(ArithmeticException e)
            {
                System.out.println("Caught Exception:" +e.getMessage());
            }
            }
        }