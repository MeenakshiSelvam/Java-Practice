package Collections.List;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLists1 {
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.add(2);
        ll.add(4);
        ll.add(6);
        System.out.println(ll);  //[2, 4, 6]



//
//        for(int i=0;i<ll.size();i++)
//        {
//            System.out.println(ll.get(i));
//        }
//
//        for(Object i : ll)
//        {
//            System.out.println(i);
//        }
//
//
//        Iterator iter = ll.iterator();
//        while(iter.hasNext())
//        {
//            System.out.println(iter.next());
//        }
        //linkedlist uses all methods present in arraylist and some extra methods like first and last() methods.bcoz, linked lists have stack and queue.

        //!!!!!!!!!!!!!
        ll.addLast(8);
        System.out.println(ll);  //[2, 4, 6, 8]

        //!!!!!!!!!!!!!!
        ll.addFirst(1);
        System.out.println(ll);  //[1, 2, 4, 6, 8]

        //!!!!!!!!!!!!!!
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll); // [2, 4, 6]

        //!!!!!
        System.out.println(ll.getFirst()); // 2
        System.out.println(ll.getLast());  // 6


    }
}
//like ArrayList we can do all operations such as read elements using for loop, for each loop.  using addAll we can copy one to another.