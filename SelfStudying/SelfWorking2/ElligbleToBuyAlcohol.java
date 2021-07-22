package SelfWorking2;

import java.util.Scanner;

public class ElligbleToBuyAlcohol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age :");
        int age= input.nextInt();

        if(age>=21){
            System.out.println("you are elligible to buy alcoohol");
        }else {
            System.out.println("Get Out");

        }
    }
}
