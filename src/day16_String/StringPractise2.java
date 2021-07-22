package day16_String;

import java.util.Scanner;

public class StringPractise2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter two words");
        String word1 = scan.next(); // Apple
        String word2 = scan.next();

        if (word1.length() >= 2 && word2.length() >= 2) {
            String result = word1.substring(1) + word2.substring(1);
            System.out.println(result);
        }else {
            System.out.println("too short");
        }
    }
}
/*
2. Ask user to enter two words. Print first word without its first character then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana

 */