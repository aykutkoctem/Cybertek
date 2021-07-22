package day20_Loops;

import java.util.Scanner;

public class FrequencyOfWord2 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String sentence= new Scanner(System.in).nextLine();
        int countOfJava=0;
        int countOfPython=0;
        for (int i=0; i<=sentence.length()-4; i++){
           String each= sentence.substring(i,i+4);
if (each.equals("java")){
    countOfJava++;
}
        }
        for (int i=0; i<=sentence.length()-6; i++){
            String each= sentence.substring(i,i+6);
            if (each.equals("python")){
                countOfPython++;
            }
        }

        boolean isequal=countOfJava==countOfPython;
        System.out.println(isequal);
    }
}
