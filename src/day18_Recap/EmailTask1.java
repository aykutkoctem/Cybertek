package day18_Recap;

import java.util.Scanner;

public class EmailTask1 {
    public static void main(String[] args) {

     String email=new Scanner(System.in).next();
     int indexOf=email.indexOf("_");
     int indexOfAt= email.indexOf("@");
     String firstName=email.substring(0,indexOf);
     String lastName=email.substring(indexOf +1,indexOfAt);
     String remainder=email.substring(indexOfAt);

        System.out.println("first Name = "+firstName);
        System.out.println("Last Name = " +lastName);
        System.out.println("remainder ="+remainder);


        String result =lastName+"_"+firstName+remainder;
        System.out.println(result);

    }
}
/*
1. EmailTask1:
 Assume that email address is constructed by person's first name and followed by an underscore and last name.
  Write a program that can swap first name with last name in the email (Seperated by an underscore).
   If the email doesn't contain an underscore print the given input email.
Ex:
input: mike_tyson@gmail.com
output: tyson_mike@gmail.com
 */