package day14_Recap;

import java.util.Scanner;

public class NumberOfDigit {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number between 1 to 100000");
        int n =scan.nextInt();
        if(n>=1 && n<=100000){
            if (n<=9){
                System.out.println("1 digit");

            }else if (n<=99){
                System.out.println("2 digit");
            }else if (n<=999){
                System.out.println("3 digit ");
            }else if (n<=9999) {
                System.out.println("4 digit");
            }else {
                System.out.println("5 digit ");
            }

        }else{
            System.out.println("Invalid number");
        }
        String result2=(n>=1 && n<=999999)?
                (n<=9)? "1 digit":(n<=99)?"2 digit":(n<=999)? "3 digit":(n<=9999)?"4 digit"
                :(n<=99999)? "5 digit":"6 digit":"invalid number";
    }
}
