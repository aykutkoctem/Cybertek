package day24_Arrays;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        //siplit
        String sentence="I love learning java programming language";
        String[] words =  sentence.split(" ");
        System.out.println(Arrays.toString(words));
        for (int i =  words.length-1; i >= 0 ; i--) {
            System.out.print(words[i]+" ");

        }
        System.out.println();
        String email="Cybertek@gmail.com";
        String[] arrays=email.split("@");
        System.out.println(Arrays.toString(arrays));


        String firstName = arrays[0];
        String mail=arrays[1];

        System.out.println("firstName = "+firstName);
        System.out.println(mail);

        //toCharArray()

        String str="ABCDE!";
        char[] characters=str.toCharArray();
        System.out.println(Arrays.toString(characters));
    }
}
