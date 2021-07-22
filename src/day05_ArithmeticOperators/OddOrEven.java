package day05_ArithmeticOperators;

public class OddOrEven {
    public static void main(String[] args) {
       int number = 200;

       boolean isEven = number%2==0;//if the remainder of number /2 is equal to zero,then numer is even
       boolean isOdd = number%2 > 0; // if the remainder of number /2 is greater than zero,then number is odd

        System.out.println(number + " is an even number: " + isEven);
        System.out.println(number + " is an odd number: " + isOdd);






    }
}
