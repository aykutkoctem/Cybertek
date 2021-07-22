package day10_IfStatements;

public class Ternary2 {
    public static void main(String[] args) {
        int number=100;

        /*
        String result="";
        if (number>0){
            result="positive";
        }else if (number<0){
            result="negative";
        }else{
            result="zero";
        }

        */
String result= (number>0) ? "positive" :(number<0)? "negative" :"zero";
int score=65;
char grade=(score>=90)?'A' :(score>=80)? 'B' :(score>=70)? 'C':(score>=60)? 'D' : 'F';

        System.out.println(grade);


    }
}
