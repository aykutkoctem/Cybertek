package day17_String;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String correctUserName ="Cybertek@gmail.com";
        String correctPassword ="Cybertek123";

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your user name:");
        String userName=scan.next();

        System.out.println("enter your password");
        String password=scan.next();
        boolean canLogIn=userName.equalsIgnoreCase(correctUserName) && password.equals(correctPassword);
        if (canLogIn){
            System.out.println("logged in succesfully");

        }else{
            System.out.println("Invalid password or user name");

        }
        scan.close();
    }
}
