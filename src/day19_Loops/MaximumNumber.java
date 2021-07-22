package day19_Loops;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int max = -2147483648; //whatever user enters it will be larger than this number
        for (int i=0; i<5; i++){
            System.out.println("enter a number");
            int n=scan.nextInt();
            if (n>max){// if the user entered number is greater than max value
                max=n;
            }

        }
        System.out.println("max = "+max);
        scan.close();
    }
}
