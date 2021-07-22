package day09_IfStatements;

public class EligibleToBuyAlcahol {
    public static void main(String[] args) {

        int age=20;

        if (age>=21){
            System.out.println("Eligible");

        }else{
            //otherwise: age < 21
            System.out.println("Not Eligible");

        }
    }
}
