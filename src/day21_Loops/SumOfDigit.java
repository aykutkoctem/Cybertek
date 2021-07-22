package day21_Loops;

public class SumOfDigit {
    public static void main(String[] args) {
        String str="A1B2C3";
        int sum=0;

        for (int i=0; i<=str.length()-1; i++){ // i:each index numbers of str
            char each=str.charAt(i);
            System.out.print(each);
            if (each>='0' && each<='9'){
               //sum+each-48;
                sum+= each-'0' ;// or I can use 48
            }
        }
        System.out.println();
        System.out.println("sum = "+sum);
    }
}
/*
3. Write a program that can return the sum of digits froma  string
             Ex:
                 input: A1B2C3

                 output:    6
 */