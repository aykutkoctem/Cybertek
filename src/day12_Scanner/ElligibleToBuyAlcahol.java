package day12_Scanner;

import java.util.Scanner;

public class ElligibleToBuyAlcahol {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age : ");
        int age=input.nextInt();

        if (age >=21){
            System.out.println("You are elligible to buy alcohol");
        }else{
            System.out.println("Get out !!");
        }

     input.close();
    }
}
