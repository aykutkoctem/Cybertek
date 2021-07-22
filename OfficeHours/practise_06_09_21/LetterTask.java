package practise_06_09_21;

public class LetterTask {
    public static void main(String[] args) {
        char ch='f';

        if (ch>'A' && ch<'Z'){
            System.out.println(ch + " is an UpperCase character");
        }else if (ch>='a' && ch<='z'){
            System.out.println(ch + " is an lowercase character");
        }else{
            System.out.println(ch + " is not a alphabetic character");
        }
    }
}
