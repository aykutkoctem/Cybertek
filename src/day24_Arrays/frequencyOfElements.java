package day24_Arrays;

public class frequencyOfElements {
    public static void main(String[] args) {
        int[] arr ={1,1,2,3,3,4};

        for (int j=0; j<=arr.length-1; j++){
            int element = arr[j]; //1
            int count=0;// to store the frequency of element
            for (int i=0; i<=arr.length-1; i++){
                if (arr[i]==element){
                    count++;

                }
            }
            if (count ==1){
                System.out.print(" "+element);
            }
        }



    }
}
/*
2. write a program that can print out the unique numbers from an array of integers
        Ex:
            int[] arr ={1,1,2,3,3,4}

            output:
                2 4
 */