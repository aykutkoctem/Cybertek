package day14_Recap;

import java.util.Scanner;

public class Stock {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("How many total shares they have already?");
        int totalShares= scan.nextInt();

        if (totalShares>0){
            System.out.println("How much total value in the stock market");
            double totalValue=scan.nextDouble();
            scan.nextLine();
            System.out.println("Enter the company name");
            String companyName=scan.nextLine();
            System.out.println("Your total stock market holding is $" +totalValue +" which  is made up of " +totalShares);
            System.out.println("Company Name= " +companyName);

        }else{
            System.out.println("Invalid number");
        }

    }
}
