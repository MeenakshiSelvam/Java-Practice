package Collections.List;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        //Declare ArrayList

        ArrayList al = new ArrayList(); //it stores different data type values.
        ArrayList<Integer> al2 = new ArrayList<Integer>(); // it stores only integer values
        List l = new ArrayList(); // we can creaste like this also.


        //add new elements to arraylist.
        al.add(10);
        al.add(20);
        al.add("Hello");
        al.add(1500.0);
        al.add(true);

        System.out.println(al);   // [10, 20, Hello, 1500.0, true]

        //size
        System.out.println(al.size()); //5

        //remove
        al.remove(0);
        al.remove("Hello");
        System.out.println(al);


        //insert new element
        al.add(0,30);
        System.out.println(al);


        //retrieve specific element

        System.out.println(al.get(0));


        //set or update element or replace.

        al.set(0,100);
        System.out.println(al);



        //search an element-contains()
        System.out.println(al.contains(100));

        //check empty or not.
        System.out.println(al.isEmpty());




        //to read elements in Arraylist - 3 methods.

        // 1 - for loop

        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }


        // 2- for Each.

        for(Object var : al)
        {
            System.out.println(var);
        }

        // 3- iterator.

        Iterator iter = al.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
    }
}
