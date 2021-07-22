package day13_Scanner;

import java.util.Scanner;

public class PersonaliNFO {
    public static void main(String[] args) {
        Scanner  scan= new Scanner(System.in);
        System.out.println("Enter your salary:");
        int salary = scan.nextInt();

        System.out.println("Enter your gender:");
        String gender = scan.next();

        scan.nextLine();
        System.out.println("Enter your full name");
        String fullName= scan.nextLine();
        scan.nextLine();
        System.out.println("Enter your job title");
        String jobtitle= scan.nextLine();

        System.out.println("salary: " +salary);
        System.out.println("gender : " +gender);
        System.out.println("full name : " +fullName);
        System.out.println("job title : " +jobtitle);
    }
}
