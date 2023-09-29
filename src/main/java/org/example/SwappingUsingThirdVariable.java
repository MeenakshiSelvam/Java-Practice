package org.example;

public class SwappingUsingThirdVariable {
    public static void main(String args[]) {

        int x = 10;
        int y = 20;
        int temp;
        System.out.println("Before Swap :");
        System.out.println("Value of x:" + x);
        System.out.println("Value of Y :"+ y);

        temp =x;
         x = y ;
         y = temp;
        System.out.println("After Swap :");
        System.out.println("Value of x:" + x);
        System.out.println("Value of Y :"+ y);

    }

}
