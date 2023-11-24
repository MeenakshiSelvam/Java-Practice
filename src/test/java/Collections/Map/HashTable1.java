package Collections.Map;

import java.util.Hashtable;

public class HashTable1 {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable(); //def capacity size is 11, Load factor 0.75.
        Hashtable ht1 = new Hashtable(100);
        Hashtable ht2 = new Hashtable(100,(float)0.95);
        Hashtable<Integer,String> ht3 = new Hashtable<Integer,String >();

        ht.put(101,"apple");
        ht.put(102,"banana");
        ht.put(102,"fruit");
        ht.put(103,"pineapple");
     //   ht.put(null,"any"); // hashtable not allowed null as key or value.
        System.out.println(ht); //unordered , no duplication , no null.

        System.out.println(ht.get(101)); //apple
        System.out.println(ht.containsKey(102)); // true.
        System.out.println(ht.containsValue("fruit")); // true.
        System.out.println(ht.isEmpty()); // false.
        System.out.println(ht.keySet()); // all keys
        System.out.println(ht.values());  // all values.
        System.out.println(ht.size()); //entry length.

        // read elements using for each and iterator AS SAME AS HASHMAP.

        for(Object o : ht.keySet())
        {
            System.out.println(o);
        }





    }
}
