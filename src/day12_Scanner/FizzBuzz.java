package day12_Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        int number=10;
        String result="";
        switch (number){
            case 3:
            case 6:
            case 9:
                result="Fizz";
                break;
            case 5:
            case 10:
                result="Buzz";

            case 1:
                result="one";
                break;
            case 2:
                result="two";
                break;

            case 4:
                result="four";
                break;


            case 7:
                result="seven";
                break;
            case 8:
                result="eight";
                break;
            default:
                result="invalid";

        }
        System.out.println("result =" +result);
    }
}
