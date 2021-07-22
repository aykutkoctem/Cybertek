package day13_Scanner;

import java.util.Scanner;

public class ScannerMethods {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("You are full time employee : ");
        boolean isfullTime=scan.nextBoolean();

        System.out.println("You are an adult");
        boolean isadult =scan.nextBoolean();

        System.out.println("you are married :");
        boolean isMarried= scan.nextBoolean();

        System.out.println(" is fulltime " +isfullTime);
        System.out.println(" is adult " +isadult);
        System.out.println(" is married " +isMarried);


    }
}
