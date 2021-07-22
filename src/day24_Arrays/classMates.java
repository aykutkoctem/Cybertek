package day24_Arrays;

import java.util.Arrays;

public class classMates {
    public static void main(String[] args) {
        String[] clasmates ={"Aykut","koc","anil","alican","utku","volkan","emre","muhtar","neco","kamil","tarik"};

        System.out.println(Arrays.toString(clasmates));

        for (int i=0; i<=clasmates.length-1; i++){
            System.out.print(" "+clasmates[i].substring(0,3)+clasmates[i].substring(clasmates[i].length()-1));
        }

    }
}
