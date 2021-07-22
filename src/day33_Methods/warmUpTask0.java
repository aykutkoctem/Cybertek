package day33_Methods;

import java.util.Arrays;
import utilities.ArraysUtility;

public class warmUpTask0 {

    public static void main(String[] args) {
        int[] numbers={100,200,300,400,500,600};
        numbers=remove(numbers,3);
        System.out.println(Arrays.toString(numbers));
        System.out.println("--------------------------------");
        double[] array1={6.5,7.5,8.5,9.5};
        System.out.println(Arrays.toString(array1));
        array1=remove(array1,1);
        System.out.println(Arrays.toString(array1));
        System.out.println("--------------------------------");
        String[] students={"Dilem","Aysu","Mucahit","Tugba","Fihilip"};
        students=remove(students,2);
        System.out.println(Arrays.toString(students));
        System.out.println("--------------------------------");
        char[] chars1={'A','B','C','D','E'};
        char[] chars2={'F','G','H','I','J'};
        char[] chars3=ArraysUtility.merge(chars1,chars2);
        System.out.println(Arrays.toString(chars3));


    }
    public static int[] remove(int[] array, int index) {
if (index<0 || index> array.length-1){
    System.err.println("Invalid Index");
    System.exit(0);
    return array;
}
        int[] result = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            } else {
                result[j++] = array[i];
            }
        }
        return result;
    }
    public static double[] remove(double[] array, int index) {
        if (index<0 || index> array.length-1){
            System.err.println("Invalid Index");
            System.exit(0);

        }
        double[] result = new double[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            } else {
                result[j++] = array[i];
            }
        }
        return result;
    }
    public static String[] remove(String[] array, int index) {
        if (index<0 || index> array.length-1){
            System.err.println("Invalid Index");
            System.exit(0);

        }
        String[] result = new String[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            } else {
                result[j++] = array[i];
            }
        }
        return result;
    }
    public static char[] remove(char[] array, int index) {
        if (index<0 || index> array.length-1){
            System.err.println("Invalid Index");
            System.exit(0);

        }
        char[] result = new char[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            } else {
                result[j++] = array[i];
            }
        }
        return result;
    }
}