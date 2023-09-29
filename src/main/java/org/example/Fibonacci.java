package org.example;

public class Fibonacci {
    public static void main(String args[])
    {
        int fno = 0;
        int sno = 1;
        int result = fno + sno;
        System.out.println(fno);
        System.out.println(sno);

        while (result <10)
        {
            System.out.println(result);
            fno = sno;
            sno = result;
            result = fno + sno;
        }
    }
}
