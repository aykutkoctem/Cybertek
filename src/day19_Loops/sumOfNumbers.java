package day19_Loops;

import java.util.Scanner;

public class sumOfNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int result=0;
        for (int i=1; i <=3; i++){
            System.out.println("enter a number");
            result+=scan.nextInt();

        }
        System.out.println("result = "+result);

scan.close();

    }
}
