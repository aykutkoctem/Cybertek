package day14_Recap;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the product name");
        String productName=scan.nextLine();

        System.out.println("Enter the price");
        Double price=scan.nextDouble();

        System.out.println("what is the quatity");
        int quantity=scan.nextInt();

        double totalPrice=price * quantity;

        scan.nextLine();
        System.out.println("Enter the full name");
        String firstName=scan.nextLine();
        scan.close();

        System.out.println(firstName+ " your order for " +quantity +" has been places." +" your total is " +totalPrice);
    }
}
