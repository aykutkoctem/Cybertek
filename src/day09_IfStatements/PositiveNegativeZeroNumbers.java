package day09_IfStatements;

public class PositiveNegativeZeroNumbers {

    public static void main(String[] args) {
        int number = 0;
        if(number>0){
            System.out.println(number +" is possitive number. ");
        }else if(number<0){
            System.out.println(number+ " is negative number");
        }else{
            System.out.println(number + " is zero");
        }
        System.out.println("-----------------------------------");
        if (number>0){
            System.out.println(number + " is positive");
        }
        if (number<0){
            System.out.println(number + "is negative");
        }
        if (number==0){
            System.out.println(number + " is zero");
        }
    }
}
