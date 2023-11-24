package Collections.List;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLists3 {
    public static void main(String[] args) {

        String arr[] = {"apple","banana","Cucumber"};

        //convert this array to Arraylist.

        ArrayList al = new ArrayList(Arrays.asList(arr));

        System.out.println(al.get(0));
    }
}
