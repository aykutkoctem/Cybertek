package day14_Recap;

import java.util.Scanner;

public class SwitchPractise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many people they live with ?");
        short numberOfPeople = scan.nextShort();
        if (numberOfPeople >= 1 && numberOfPeople<=9999) {


            switch (numberOfPeople) {
                case 1:
                case 2:
                    System.out.println("Live with less then 3 people");
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    System.out.println("Live with 3 - 6 people");
                    break;
                default:
                    System.out.println("Live with more than 6 people");

            }
        }else{
            System.out.println("Invalid Number");
        }
    }
}
