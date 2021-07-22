package day14_Recap;

import java.util.Scanner;

public class ScannerPractise2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your zipcode");
        long zipcode=scan.nextLong();

        System.out.println("How many people do you with?");
        byte numberOfPeople=scan.nextByte();

        System.out.println("are you maried");
        boolean isMaried=scan.nextBoolean();

        System.out.println("I see you are " +((isMaried)? " married" :" not married")+" and live with" +numberOfPeople
        +"people in your house which is in the " +zipcode +"area");

    }
}
