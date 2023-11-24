package Collections.Queue;

import java.util.LinkedList;

public class LinkedListQ1 {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        //exactly same as priority Queue but its heterogeneous.
        //it uses all the same methods as in priority queue.
        ll.add(100);
        ll.add(100);
        ll.add("Hello");
        ll.add(20);

        System.out.println(ll);
    }
}
