package Collections.List;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists2 {

    public static void main(String[] args) {


        ArrayList alOne= new ArrayList();
        ArrayList alTwo = new ArrayList();

        alOne.add(1);
        alOne.add(2);
        alOne.add(4);
        alOne.add(3);

        System.out.println(alOne);
// copy one arraylist to another.


        alTwo.addAll(alOne);
        System.out.println(alTwo);

        //to remove all from alTwo
        alTwo.removeAll(alOne);
        System.out.println(alTwo);


        // sorting elements

        Collections.sort(alOne); //default asc order.
        System.out.println(alOne);

        Collections.sort(alOne,Collections.reverseOrder()); // desc order
        System.out.println(alOne);

        Collections.shuffle(alOne); //shuffle random order.
        System.out.println(alOne);

    }
}
