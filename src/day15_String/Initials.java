package day15_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first name");
        char f=scan.next().charAt(0); //Aykut

        System.out.println("Enter your last Name");
        char l=scan.next().charAt(0);
        scan.close();
/*
       char f= firstName.charAt(0);
       char l= lastName.charAt(0);

 */

       String initial = f +"."+l;

        System.out.println("initial= " +initial+".");

    }
}
/*
ask users 1.first name
          2.last name
          then print the initials
          ex;daniel
             jones
             initials:D.J.
 */