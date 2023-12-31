package Collections.Set;

import java.util.HashSet;

public class Hashsets2 {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        System.out.println(set1);  //[1, 2, 3, 4, 5]

        HashSet<Integer> set2 = new HashSet<Integer>();
        set2.add(3);
        set2.add(3);  // no duplication allowed
        set2.add(4);
        set2.add(5);
        System.out.println(set2);  //[3, 4, 5]


        //union
        set1.addAll(set2);
        System.out.println("union  :" +  set1); //[1, 2, 3, 4, 5]


        //intersection
        set1.retainAll(set2);
        System.out.println("Intersection :" +set1);  //[3, 4, 5]


        //difference
        set1.removeAll(set2);
        System.out.println("Difference :" + set1); //[]


        //subset(check set 2 is subset of set 1) -if executes from the first.

        System.out.println( set1.containsAll(set2)); //true
        System.out.println("Subset :" + set1);  //[1,2,3,4,5]




    }
}
