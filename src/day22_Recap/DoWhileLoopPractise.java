package day22_Recap;

import java.util.Scanner;

public class DoWhileLoopPractise {

    public static void main(String[] args) {
     int sumOfEven=0;
     int sumOfOdd=0;
    int i=0;
    do{
if (i%2==0){
    sumOfEven+=i;
}else {
    sumOfOdd+=i;
}
        System.out.println(i);
        i++;
    }while (i<=10); //i:0 2 3 4 5 6 7 8 9 10
        System.out.println("sumOfEven= "+sumOfEven);
        System.out.println("sumOfOdd= "+sumOfOdd);

        System.out.println("-------------------------------------------------");
        Scanner scan=new Scanner(System.in);
        String userName="JohnJames";
        String password="John123";
        String u="";
        String p="";
        int attemps=1;
        while (!(u.equals(userName) && p.equals(password))   ){
            System.out.println("Enter your username: ");
            u=scan.next();

            System.out.println("Enter your password");
            p=scan.next();
          attemps++;
          if (attemps==3){
              System.out.println("Your account is locked");
              System.exit(0);
          }

        }
        /*
        do {
            System.out.println("Enter your username: ");
            u=scan.next();

            System.out.println("Enter your password");
            p=scan.next();
        }while (!(u.equals(userName) && p.equals(password))   );

         */
        System.out.println("Logged in");
    }
}
