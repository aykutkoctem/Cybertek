package day13_Scanner;

import java.util.Scanner;

public class NextMethod {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your first name");
        String Firstname= scan.next(); // only takes  the first word
        System.out.println("Enter your last name");
        String LastName=scan.next();
        System.out.println(" last name = " +LastName);

        String fullName=Firstname + " "+LastName;
        System.out.println("full name " +fullName);

        String gender=scan.next();



    }
}
