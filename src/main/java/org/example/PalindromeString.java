package org.example;

public class PalindromeString {
    public static void main(String args[]){
        String str = "liril";
        String reverse = " ";

        for(int i = str.length()-1; i>=0;i--){
            reverse = reverse + str.charAt(i);
        }
        if(reverse.equals(str))
        {
            System.out.println("String is Palindrome");
    }
        else {
            System.out.println("String is not a Palindrome");
}
    }

}
