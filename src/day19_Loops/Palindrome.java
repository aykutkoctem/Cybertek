package day19_Loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("enter a word");
        String word=new Scanner(System.in).next();
        String reverseword="";
        for (int i=word.length()-1; i>=0; i--){
            reverseword+=word.charAt(i);
        }
        boolean isPalindrome=word.equalsIgnoreCase(reverseword);
        if (isPalindrome){
            System.out.println(word+" is palindrome");
        }else {
            System.out.println(word+" is not palindrome");
        }

    }
}
