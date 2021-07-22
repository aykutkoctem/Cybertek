package day19_Loops;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int min=2147483647;

        for (int i=0; i<5; i++){
            System.out.println("enter a number");
            int n =scan.nextInt();
            if (n<min){
                min=n;



            }
        }
        System.out.println("min = " + min);


    }
}
