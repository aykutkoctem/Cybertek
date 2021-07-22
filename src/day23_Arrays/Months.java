package day23_Arrays;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        String[] months={"Jan", "Feb", "March","April","May","Jun","July","Aug","Sep","Oct","November","Dec"};
               //index;    0      1        2      3      4      5     6     7     8     9

        System.out.println("Enter a number");
        int n= new Scanner(System.in).nextInt();

        if (n>=1 && n<=12) {
            System.out.println(months[n - 1]);
        }else {
            System.err.println("Invalid");
        }

    }
}
