package day23_Arrays;

public class MaximumNumber {
    public static void main(String[] args) {
        int[] numbers={10,5,4,400,50,0,-1};
        int max=numbers[0];
        int min=numbers[0];

        for (int i=0; i<=numbers.length-1; i++){
            int each=numbers[i];
            if (each>max){
                max=each;
            }
            if (each<min){
                min=each;
            }
        }
        System.out.println("max = "+max);
        System.out.println("min = "+min);
    }
}
/*
// write a program that can find max number from an array of integers

ex:
array={10,5,,4,400,50,0,-1};
output:400

// write a program that can find min number from an array of integers

ex:
array={10,5,,4,400,50,0,-1};
output:-1

 */
