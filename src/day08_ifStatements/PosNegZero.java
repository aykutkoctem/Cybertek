package day08_ifStatements;

public class PosNegZero {
    public static void main(String[] args) {
        int number =0;
        boolean positive =number >0;
        boolean negative =number <0;
        boolean zero     = !positive && !negative ;
        if (positive){
            System.out.println(number+ "  is positive");
        }
        if (negative) {
            System.out.println(number + "  is negatif");
        }

        if (zero) {
            System.out.println(number + " is zero ");
        }


    }

}
