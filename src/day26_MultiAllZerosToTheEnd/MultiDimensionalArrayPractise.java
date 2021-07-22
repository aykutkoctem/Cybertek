package day26_MultiAllZerosToTheEnd;

public class MultiDimensionalArrayPractise {
    public static void main(String[] args) {
        int[][] arr2D={{1,2,3},{4,5,6,7,8},{9,10,11,12,13},};
        //                0         1             2
        for (int i = arr2D.length-1; i >=0; i--) {// index number of each single dimensional array
/*
            for (int j=0; j<arr2D[i].length;  j++){ // j:index number of each element in single dimensional array
                System.out.print(arr2D[i][j]+" ");

 */
            for(int each : arr2D[i]){
                System.out.print(each+" ");
            }

            System.out.println();
        }
        System.out.println("------------------------------------");
        for(int[]each1D :arr2D) {
            for (int j = each1D.length-1; j >= 0; j--) {
                System.out.print(each1D[j]+" ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------");
        for (int i = arr2D.length - 1; i >= 0; i--) {
            for (int j = arr2D[i].length - 1; j >= 0; j--) {
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }
    }
}
