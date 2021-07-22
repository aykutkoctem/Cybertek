package day07_ShortHand_Relational;

public class FreeShipping {
    public static void main(String[] args) {
        double price = 15;
        boolean isPrimeMember =true;

        boolean isEligableForFreeShipping = price >= 25 ||  isPrimeMember == true;

        System.out.println("is eligible for free shipping: " +isEligableForFreeShipping);


    }
}
