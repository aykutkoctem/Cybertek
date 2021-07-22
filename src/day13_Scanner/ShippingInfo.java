package day13_Scanner;

import java.util.Scanner;

public class ShippingInfo {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println( "enter your build number");
        int buildnumber= scan.nextInt();

        scan.nextLine();
        System.out.println("Enter your street adress");
        String streetadress = scan.nextLine();

        System.out.println("enter your city name");
        String city = scan.nextLine();

        System.out.println("Enter your state");
        String state= scan.next();

        System.out.println("Enter your zipcode");
        String zipcode= scan.next();

        scan.nextLine();
        System.out.println("Enter your full name");
        String fullName=scan.nextLine();

        String shippingIntro=fullName+ "\n" +buildnumber + " " +streetadress +"\n" +city +" "+state+" "+zipcode + "/n"+fullName;




    }
}
