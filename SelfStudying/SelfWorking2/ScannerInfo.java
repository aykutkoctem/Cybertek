package SelfWorking2;

import java.util.Scanner;

public class ScannerInfo {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int num1 =input.nextInt();
        int num2 =input.nextInt();
        int addition=num1 + num2;
        int subtraction=num1-num2;
        int multiplication=num1 * num2;
        int division= num1/num2;


        System.out.println("addition = " +addition);
        System.out.println("subtraction = " +subtraction);
        System.out.println("multiplication = " +multiplication);
        System.out.println("division = " +division);

    }
}
