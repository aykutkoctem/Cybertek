package SelfWorking3;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("enter first number");
        double num1=scan.nextDouble();

        System.out.println("enter a math operator");
        char mathOperator=scan.next().charAt(0);

        System.out.println("enter second number");
        double num2=scan.nextDouble();

        double result=0;
        switch (mathOperator){
            case'-':
                result=num1-num2;
                break;
            case'+':
                result=num1+num2;
                break;
            case'*':
                result=num1 * num2;
                break;
            case'/':
                result=num1 / num2;
                break;
            default:
                System.err.println("invalid");

        }
        System.out.println("result = " +result);


    }
}
