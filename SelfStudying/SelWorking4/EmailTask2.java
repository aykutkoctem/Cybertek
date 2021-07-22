package SelWorking4;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {
        String email=new Scanner(System.in).nextLine();
        int indexOf_=email.indexOf("_");
        int indexOfAt=email.indexOf("@");
        String firstName=email.substring(0,indexOf_);

        firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1);
        System.out.println("First name ="+firstName);
        String lastName=email.substring(indexOf_+1,indexOfAt);
        lastName=lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
        System.out.println("Last name ="+lastName);
        String domain=email.substring(indexOfAt+1,email.indexOf("."));
        System.out.println("domain ="+domain);

    }
}
