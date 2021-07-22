package day30_Recap;

import java.util.Scanner;

public class WhileLoopRewiev {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String answer="";
        int n=0;
        int sum=0;

        while (!answer.equalsIgnoreCase("no")) { // false:if the answer is "no"
            System.out.println("Enter a number");
            n = scan.nextInt();
            sum+=n;
            scan.nextLine();
            System.out.println("Would you like to enter another number");
            answer = scan.next();

        while (!(answer.equalsIgnoreCase("yes")  || answer.equalsIgnoreCase("no"))){
            System.err.println("Invalid Answer! Would you like to enter another number");
            answer=scan.next();
        }
        if (answer.equals("no")){
            System.out.println("Thank you");
        }
        }
        System.out.println("sum = " + sum);
    }
}
