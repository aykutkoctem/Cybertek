package day21_Loops;

public class LetterDigitSpecialChar {
    public static void main(String[] args) {
       String input="mn@#123Ab!";

       String letter="";//mnAb
       String digit=""; //123
       String specialCharacters="";//@#!

       for (int i=0; i<=input.length()-1; i++){
           char each=input.charAt(i);
           if (each>='A' && each<='Z'){
               letter+=each;
           }else if (each>='a' && each<='z'){
               letter+=each;
           }else if (each>='0'&& each<='9'){
               digit+=each;
           }else {
               specialCharacters+=each;
           }
       }
        System.out.println("letters = "+letter);
        System.out.println("special characters = "+specialCharacters);
        System.out.println("digit = "+digit);


    }
}
/*
4. write a program that can retive the digits, letters and special characters from a string
Ex:
input:
mn@#123Ab!

output:
letters: mnAb
digits: 123
special chars: @#!
 */