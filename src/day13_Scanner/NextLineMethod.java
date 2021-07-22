package day13_Scanner;

import java.util.Scanner;

public class NextLineMethod {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        /*
        System.out.println("Enter your job title");
        String jobTitle =scan.next();


        System.out.println("enter your gender");
        String gender=scan.next();
        System.out.println("your job title : " +jobTitle);
        System.out.println("gender =" +gender);


         */
        System.out.println("Enter your job title");
        String jobtitle= scan.nextLine();
        System.out.println("YOUR job title is " +jobtitle );
    }
}
