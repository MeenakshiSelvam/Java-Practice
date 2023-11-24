package Collections.Set;

import java.util.LinkedHashSet;

public class LinkedHashSets1 {

    public static void main(String[] args) {
        LinkedHashSet lh = new LinkedHashSet(); //heterogeneous set.
        LinkedHashSet<Integer> lh1 = new LinkedHashSet<Integer>(); //homogeneous set

        lh.add(100);
        lh.add(100); // no duplicate allowed.
        lh.add(20);
        System.out.println(lh);  //ordered

    }
}
