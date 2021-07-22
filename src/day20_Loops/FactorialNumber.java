package day20_Loops;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        System.out.println("enter a number:");
        Scanner scan=new Scanner(System.in);
        int result=1;
        int number=scan.nextInt();
        for (int i=number; i>=1; i--){
            result*=i;
        }
        System.out.println("result= "+result);
        scan.close();
    }
}
/*
1. Write a program that can return the factorial number of any given number
Ex:
input: 5
output: 120  ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */