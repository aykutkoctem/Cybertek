package practise_06_09_21;

import java.util.Scanner;

public class IfElseSmallTask {
    public static void main(String[] args) {
        System.out.println("==============task4============");
        char letter= 'Q';
        if( (letter >= 'a' && letter <='z')  || (letter >='A' && letter<='Z' )){
            System.out.println("Your letter is in Alphabet");
        }else{
            System.out.println("Your letter is not in alphebet");
        }

        Scanner input=new Scanner(System.in);
    }
}
/*
4- Create  program to check whether a character is an alphabet or not
                            An input character is an alphabet if it lies in between a-z or A-Z.

                            INPUT : '.'            EXPECTED : Your letter is not in alphabet

                             INPUT : 'a'            EXPECTED : Your letter is in alphabet
 */