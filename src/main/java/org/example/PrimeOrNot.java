package org.example;

public class PrimeOrNot {
    public static void main(String args[])
    {
        int num = 49;
        boolean isPrime =true;
        for(int i=2;i<num; i++)
        {
            if(num% i == 0)
            {
                isPrime = false;
                break;
            }
        }
        if(isPrime) {
            System.out.println("It is Prime Number");
        } else {
            System.out.println("It is not a prime number");
        }
    }
}
