package day10_IfStatements;

public class ConvertNumberToWord {
    public static void main(String[] args) {
        //0-9
        // Zero , one , two ,three , four , five , six , seven , eight , nine , invalid
        int n = 25;
        String word = "";
        if (n >= 0 && n <= 9) {


            if (n == 0) {
                word = "zero ";
            } else if (n == 1) {
                word = "one";
            } else if (n == 2) {
                word = "two";
            } else if (n == 3) {
                word = "three";
            } else if (n == 4) {
                word = "four";
            } else if (n == 5) {
                word = "five";
            } else if (n == 6) {
                word = "six";
            } else if (n == 7) {
                word = "seven";
            } else if (n == 8) {
                word = "eight";
            } else {
                word = "nine";
            }
        }else {
            word="invalid";
        }
        System.out.println("word = "+word);
    }
}
