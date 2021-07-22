package day24_Arrays;

import java.util.Arrays;

public class ReverseArrey {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        int[] reveresedArray = new int[array.length]; //enough capacity to contain the elements of original array

        for (int i = array.length-1, j=0 ; i >=0 ; i--,j++) {//i is the index numbers of array starting from last index
            System.out.print(array[i]+" ");                  //j is the index numbers of reversedArray starting from
            reveresedArray[j]=array[i];
        }
        System.out.println();
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reveresedArray));
    }
}
