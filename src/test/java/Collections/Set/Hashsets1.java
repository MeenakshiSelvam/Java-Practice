package Collections.Set;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsets1 {
    public static void main(String[] args) {

        // 4 ways of creasting hashset.

        HashSet hs = new HashSet(); // default size is 16, load factor is 0.75.
        HashSet hs1 = new HashSet(100);
        HashSet hs2 = new HashSet(100, (float) 0.95);
        HashSet<Integer> hs3= new HashSet<Integer>();

        hs2.add(100);
        hs2.add("Hello");
        hs2.add(null);
        hs2.add(1);
        System.out.println(hs2);


        //remove
        hs2.remove(100); // value not index bcoz unordered.
        hs2.remove("Hello");
        System.out.println(hs2);

        //contains
        System.out.println(hs2.contains(1));

        //Empty
        System.out.println(hs2.isEmpty());


        //read elements using for each and iterator.
//        for(Object o : hs2)
//        {
//            System.out.println(o);
//        }
//
//        Iterator iter = hs2.iterator();
//        while(iter.hasNext())
//        {
//            System.out.println(iter.next());
//        }


        //we can use addAll to copy one hashset to another.





    }
}
