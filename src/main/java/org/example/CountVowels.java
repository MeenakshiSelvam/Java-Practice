package org.example;

public class CountVowels {
    public static void main(String  args[])
    {
        String str = "orange";
        int count =0;

        for(int i = 0; i<str.length(); i++)
        {
            Character ch = str.charAt(i);
            if(ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' ||ch=='u')
            {
                count++;
            }

        }
        System.out.println("Count of Vowels :"  + count);
        System.out.println("Build is triggerred");




    }
}
