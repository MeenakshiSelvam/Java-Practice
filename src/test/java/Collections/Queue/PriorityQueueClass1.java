package Collections.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueClass1  {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();

        //add elements using add() and offer()

        pq.add(100);
        pq.add(100);
        pq.add(400);
        pq.offer(500);

        // pq.add("hello");  not allowed in priority queue bcoz its homogeneous.
        System.out.println(pq); //allows duplicate and insertion ordered.

        // get head element using element() and peek()
        System.out.println(pq.element());  //if no element return exception
        System.out.println(pq.peek());   //if no element prints null


        // return and remove element using remove() and poll()
//        System.out.println(pq.remove(400));
//        System.out.println(pq.remove(400));
//        pq.poll(500);
//        pq.poll();
//        System.out.println(pq.poll());
//        System.out.println(pq.poll());

        System.out.println(pq.remove());
        System.out.println(pq.poll());
        System.out.println(pq.remove());
        System.out.println(pq.poll());
        // System.out.println(pq.remove());
        System.out.println(pq.poll());

        System.out.println(pq);

        //read elements using for each and iterator.

        for (Object o : pq) {
            System.out.println(o);
        }

        Iterator iter = pq.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

    }
}

