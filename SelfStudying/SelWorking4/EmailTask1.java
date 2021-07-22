package SelWorking4;

import java.util.Scanner;

public class EmailTask1 {
    public static void main(String[] args) {
        String email=new Scanner(System.in).nextLine();
        int indexOf_=email.indexOf("_");
        int indexofAt=email.indexOf("@");
        String firstName=email.substring(0,indexOf_);
        String lastName=email.substring(indexOf_+1,indexofAt);
        String remaining=email.substring(indexofAt);
        System.out.println("remaining= "+remaining);
        System.out.println("first name = "+firstName);
        System.out.println("last name = "+lastName);
        String result=lastName+"_"+firstName+remaining;
        System.out.println(result);
    }
}
