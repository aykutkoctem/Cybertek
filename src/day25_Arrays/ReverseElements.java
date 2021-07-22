package day25_Arrays;

import java.util.Arrays;

public class ReverseElements {
    public static void main(String[] args) { // index numbers of the array(starting from 0)
        String[] array = {"Java", "Python", "C#","Cybertek","Aykut"};

        for (int j = 0; j <= array.length - 1; j++) {


        String element = array[j];//Java  //element og the array
        String reverse = ""; //avaJ // to store the reversed version of the element

        for (int i = element.length() - 1; i >= 0; i--) {//index numbers of the string
            reverse += element.charAt(i); // gets the characters from the string elements

        }
        array[j] = reverse;// assign reversed element to the index of the array
    }
        System.out.println(Arrays.toString(array));

    }
}
