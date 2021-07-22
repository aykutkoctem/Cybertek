package day25_Arrays;

import java.util.Arrays;

public class ReverseElements2 {
    public static void main(String[] args) {
        String[] array ={"Java","Pyhton","C#","Cybertek","School"};
        for(String element:array){
            String reverse="";

            for (int i =element.length()-1; i>=0; i--){
                reverse+=element.charAt(i);
            }
            System.out.print(reverse+" ");

        }
        System.out.println();
    }
}
