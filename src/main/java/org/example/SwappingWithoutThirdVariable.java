package org.example;

public class SwappingWithoutThirdVariable {

    public static void main(String args[]) {

        int x = 10;
        int y = 20;

        System.out.println("Before Swap :");
        System.out.println("Value of x:" + x);
        System.out.println("Value of Y :"+ y);

        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("After Swap :");
        System.out.println("Value of x:" + x);
        System.out.println("Value of Y :"+ y);

    }

}
