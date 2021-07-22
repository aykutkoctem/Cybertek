package day23_Arrays;

import java.util.Scanner;

public class AvarageNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("How many number do yu want want to enter?");
        int[] numbers=new int[scan.nextInt()];
        int sum=0;

        for (int i=0; i<=numbers.length-1; i++){
            System.out.println("enter a number");
            numbers[i]=scan.nextInt();
            sum+=numbers[i];
        }
        System.out.println("sum = "+sum);
        double avarage=(double) sum/numbers.length;
        System.out.println("avarage = "+avarage);

scan.close();

    }
}
