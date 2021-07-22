package day13_Scanner;
import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Cents");
        int cents= scan.nextInt(); //225==2.25
        int dollars=cents/100;
        int remainder = cents %100;
        if (cents>=0) {
            if (remainder == 0) {
                System.out.println(cents + " is equal to " + dollars + " dollars " + remainder + " cents ");
            } else {
                System.out.println(cents + " is equal to " + dollars + " dollars and " + remainder + " cents");
            }
        }else{
            System.err.println("Invalid Amount");
        }
        scan.close();
    }
}
