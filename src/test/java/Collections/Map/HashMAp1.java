package Collections.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMAp1 {

    public static void main(String[] args) {
        HashMap hm = new HashMap();//heterogeneous.
        HashMap<Integer,String> hm1 = new HashMap<Integer,String>();//homogeneous for key and value.
        hm.put(101,"cena");
        hm.put(102,"john");
        hm.put(103,"john");
        hm.put(103,"jackey");  // this is overwriiten.
        hm.put(102,"john");  //can't be created.

        System.out.println(hm);// {101=cena, 102=john, 103=sgjasdg}      // unordered, no duplication, one null key allowed, multiple null values.
        System.out.println(hm.get(101)); //cena.
        hm.remove(101);
        System.out.println(hm); // {102=john, 103=sgjasdg}
        System.out.println(hm.containsKey(102)); // true
        System.out.println(hm.containsValue("john")); // true
        System.out.println(hm.isEmpty()); // Empty.
        System.out.println(hm.keySet()); // [102,103].
        System.out.println(hm.values()); // [john,jackey].
        System.out.println(hm.entrySet()); // [102 = john,103= jackey].


        //read elements using for each.


        for(Object o : hm.keySet())
        {
            System.out.println(o   +  "  "  + hm.get(o));
        }

        for(Object o : hm.values())
        {
            System.out.println(o);
        }

        for(Object o : hm.entrySet())
        {
            System.out.println(o);
        }


//        for(Map.Entry entry : hm.entrySet())
//
//        {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//            System.out.println(entry.setValue(100));
//        }


        // read elements using iterator.
       // Iterator iter = hm.iterator(); //iterator() method directly not supported.


        System.out.println("......");
        Set s = hm.entrySet();
        Iterator iter = s.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }




    }
}
