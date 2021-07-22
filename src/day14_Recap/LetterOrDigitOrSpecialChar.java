package day14_Recap;

public class LetterOrDigitOrSpecialChar {
    public static void main(String[] args) {
        char  ch='0';

        boolean isDigit = ch >= '0' && ch<='9';
        boolean isLetter = (ch>='A' && ch<='Z') || (ch >'a' && ch <'b');
        // if the character is upper case letter or lower case letter

       //     boolean isSpecialCharacter=!isDigit && !isLetter;
       /*
        String result="";

        if (isDigit){
            result=" digit ";
        }else if (isLetter){
            result="Letter";

        }else {
            result="special charachter  " ;


        }
      */
        String result=(isDigit)? ch+ "is digit":(isLetter)? ch+"is Letter" :ch+ "is special character";
        System.out.println(result);
    }
}
