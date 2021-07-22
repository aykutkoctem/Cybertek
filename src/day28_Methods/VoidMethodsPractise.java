package day28_Methods;

public class VoidMethodsPractise {
    public static void main(String[] args) {

        printOddNumbers(100,200);
       // printEvenNumber("12","25");
        printEvenNumber(100,200);

        calculateAge(1092,2041);
        System.out.println("-------------------------------------------");
        eligibleToVote(18,false);
        System.out.println("-----------------------------");
        calculate(100,200,'-');
    }
    public static void printOddNumbers(int from,int to){

        for (int i = from; i <=to ; i++) {
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void printEvenNumber(int from,int to){
        for (int i = from; i <=to ; i++) {
           if (i%2==0){
               System.out.print(i+" ");
           }
        }
        System.out.println();
    }
    public  static void calculateAge(int birthYear,int currentYear){
        System.out.println("Your age is: "+(currentYear-birthYear));
    }
    public static void eligibleToVote(int age,boolean isUsCitizen){
        if (age>=21 && isUsCitizen){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are not eligible to vote");
        }
    }
    public static void calculate(int num1,int num2,char operator){
        switch (operator){
            case '-':
                System.out.println("Substraction:" +(num1-num2));
                break;
            case '+':
                System.out.println("Addition:" +(num1+num2));
                break;
            case '*':
                System.out.println("Multiplication:" +(num1*num2));
                break;
            case '/':
                System.out.println("Division:" +(num1/num2));
                break;
            case '%':
                System.out.println("Remainder:" +(num1%num2));
                break;
            default:
                System.out.println("invalid");
        }
    }
}
/*
task:
    1. create a method that can print odd numbers between 1~100 in a same line seperated by space

    2. create a method that can print even numbers between 1~100

    3. create a method that can calculate the age of the person

    4. check eligibility to vote
 */