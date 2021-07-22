package day32_MethodOverloading;

import java.util.Arrays;
import java.util.Scanner;

public class test2 {

    // returns the maximum number from an array of int
    public static int max(int[] array){
        int max= array[0] ;

        for (int each : array) {
            max =  Math.max( each, max  );
        }

        return max;
    }


    // returns the maximum number from an array of double
    public static double max(double[] array){
        double max= array[0] ;

        for (double each : array) {
            max =  Math.max( each, max  );
        }
return max;
    }







// DO NOT TOUCH THE MAIN METHOD

    public static void main(String [] args) {

        Scanner in = new Scanner(System.in);
        boolean runInt = in.nextBoolean();
        int size = in.nextInt();

        if(runInt) {
            int [] arr = new int[size];
            for(int i=0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println(max(arr));
        } else {
            double [] arr = new double[size];
            for(int i=0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println(max(arr));
        }

    }
}