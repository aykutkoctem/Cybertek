package practise_6_30_21;

import java.util.Scanner;

public class PinCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secretPincode=1234;
        int pinCode;
        int count=0;
       do {
           if (count==3){
               System.out.println("your accountt is locked");
               System.exit(0);
           }
           System.out.println("Please enter your pincode");
           pinCode=input.nextInt();
           count++;
       }while (pinCode!=secretPincode);
        System.out.println("Welcome to your account");
    }
}
/*
	 Write a program to ask user to "Please Enter your pinCode"

						  if the pinCode is valid print out "Welcome to your account "

						  if it is invalid ask again pinCode to verify it

						  Repeat this steps the user enters correct pinCode


 */