package day11_Switch;

public class TernaryPractise {
    public static void main(String[] args) {
        double salary = 90000;
        int creditScore = 720;
        String result = (salary >= 60000 && creditScore >= 650) ? " Loan approved " : "Loan Denied ";
       /* if (salary>= 60000 && creditScore >= 650){ // if the person is eligible for loan
            result =" Loan Approved ";

        }else{// if the person is not eligible for loan
            result= " Loan denied ";
        }
        System.out.println("result = " +result );
        /*
        */

        System.out.println("'-------------------------------------");
        String sport = "Golf";
        int price = (sport == "Soccer" || sport == "Tennis") ? 100 : 50;
        System.out.println("Price = " + price);
        System.out.println("----------------------------------------------");
        int n1 = 100;
        int n2 = 200;
        int n3 = 300;
        String result2 = (n1 > n2 && n1 > n3) ? " n1 is bigger" : (n2 > n1 && n2 > n3) ? "n2 is bigger" : "n3 is bigger";
        System.out.println(" result2 =" + result2);
        System.out.println("-------------------------------------------------------------------");
        int number = 6;
        String name = " ";

        if (number >= 1 && number <= 12) {
            name =(number == 1) ? "jan" : (number == 2) ? "feb" : (number == 3) ? "march" : (number == 4) ? "april" : (number == 5) ? "May"
                    : (number == 6) ? "Jun" : (number == 7) ? "Jul" : (number == 8) ? "Aug" : (number == 9) ? "Sep" : (number == 10) ? "Oct"
                    : (number == 11) ? "Nov" : "Dec";
            //11 ? and 11 :
        } else {
            name = "invalid";
        }
    }


}

/*
1. Given two values: yearly salary and credit score determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650
                    Otherwise print: "Loan Denied"
             NOTE: MUST APPLY TERNARY


 */
/*
2. Given a sport you play at the community center you will have to pay some entrance fee.

                    Soccer or Tennis fee is: 100
                    Otherwise fee is: 50
               NOTE: MUST APPLY TERNARY

 */
/*
3. write a program that checks for the bigger of 3 numbers.
        you get 3 int variables with different values: n1 , n2 and n3
            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"
         NOTE: MUST APPLY TERNARY
 */