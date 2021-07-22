package SelfWorking3;

import java.util.Scanner;

public class Innitial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
        char f=scan.next().charAt(0);

        System.out.println("Enter your last Name");
        char l=scan.next().charAt(0);
        scan.close();
        /*
        char f=firstName.charAt(0);
        char l=lastName.charAt(0);

         */

        String intial=f +"."+l;
        System.out.println("initial = " +intial);

    }
}
/*
Ask user to enter;
     1.first Name
     2.last Name
     then print the initials
       ex:Aaron
          King

          Initial;
 */