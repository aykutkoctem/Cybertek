package practise_06_09_21;

public class Discount {
    public static void main(String[] args) {

        int quantity=15;
        double unitprice=100;
        double totalcost=quantity * unitprice;
        double discountRate=0.1;
        double totalDiscount= 0;




        if (totalcost>1000){
            totalDiscount=discountRate * totalcost;
            System.out.println("you get a discount of " +totalDiscount + " and your total cost is " + totalcost);
        }else{
            System.out.println("no discount applied");
        }

    }
}
/*
Task :A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
 Create a quantity variable
Suppose, one unit will cost 100.
Judge and print total cost for user.
( Scanner Class can be used )

 INPUT for quantity :  5  EXPECTED : No discount applied

INPUT for quantiy  :  15  EXPECTED : You get a discount of $discount and
your total cost is $totalCost
 */