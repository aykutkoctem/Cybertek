package day17_String;

import java.util.Scanner;

public class Initial {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName=scan.next();
        System.out.println("Enter your last name");
        String lastName=scan.next();

        //String initial=firstName.toUpperCase().charAt(0) +"."+lastName.toUpperCase().charAt(0);
        String initial= firstName.substring(0,1).toUpperCase() +"."+lastName.substring(0,1).toUpperCase();
        System.out.println(initial);

        scan.close();
    }
}
/*
2. write a program that can return the initials of the user
            ex:
                cybertek
                school
            output:
                C.S
 */