package SelWorking4;

import java.util.Scanner;

public class DigitLetterSpecialChar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a word");
        String word=scan.next();
        char f=word.charAt(0);
         String result="first character is ";
        if (f>='0' && f<='9'){
            result+="digit";
        }else if (f>='a' && f<='z'){
            result+=" lower case letter";
        }else if (f>='A' && f<='Z'){
            result+=" upper case letter";
        }else{
            result+=" special character";
        }
        System.out.println(result);
        scan.close();




    }
}
