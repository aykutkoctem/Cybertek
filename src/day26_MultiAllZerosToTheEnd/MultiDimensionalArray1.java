package day26_MultiAllZerosToTheEnd;

import java.util.Arrays;

public class MultiDimensionalArray1 {
    public static void main(String[] args) {
        int[][]arr2D={{1,2,3},{4,5},{6,7,8}};
  //index:               0      1      2
        System.out.println(arr2D.length);
        System.out.println(Arrays.deepToString(arr2D));

        //{4,5}
        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println( arr2D[1][1]);
        System.out.println("------------------------------------");
        for (int i = 0; i < arr2D.length; i++) { //index numbers of single dimensional arrays
            int[]each1DArray=arr2D[i];
            System.out.println(Arrays.toString(each1DArray));
            for (int j = 0; j < each1DArray.length ; j++) {
                System.out.println(each1DArray[j]);
            }
        }
        System.out.println("-------------------------------");
        for ( int[] each1D :arr2D ){
            System.out.println(Arrays.toString(each1D));
            for (  int element:each1D){
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }
}
