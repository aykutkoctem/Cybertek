package day13_Scanner;

import java.util.Scanner;

public class NextMethod2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter your age");
        int age= scan.nextInt();

        scan.nextLine();

        System.out.println("enter job title");
        String jobtitle=scan.nextLine();

        System.out.println("age = " +age);
        System.out.println("job title = " +jobtitle);
    }
}
