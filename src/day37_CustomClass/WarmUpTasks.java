package day37_CustomClass;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class WarmUpTasks {
    public static void main(String[] args) {

        String[] names={"Esra","Sabir","Raphael","Mousa"};
        ArrayList<String> students =new ArrayList<>();
        students.addAll(Arrays.asList(names));
        System.out.println(students);
        Collections.swap(students,0,students.size()-1);
        System.out.println(students);

        System.out.println("-----------------------------------------------------");
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,2,2,2,3,4,5,5,6,6,7,8,9,10));
        /*
        int firstUnique=0;
        for (Integer each : list) {
            if (Collections.frequency(list,each)==1){
                firstUnique=each;
                break;
            }
        }

         */
        ArrayList<Integer> uniques=new ArrayList<>(list);
        uniques.removeIf(p-> Collections.frequency(uniques,p)!=1);
        int firstUnique=uniques.get(0);
        System.out.println(uniques);
        System.out.println("firstUnique = " + firstUnique);
        System.out.println("------------------------------------------------------------------");


        String str="AABBCCDDDDDDDDDEE";
        String result="";
        ArrayList<String> list2=new ArrayList<>(Arrays.asList(str.split(""))); // A, B, C, D, E
        for (String each : StringUtility.removeDup(str).split("")) {          //  2, 2, 2, 2, 2
         int frequency=Collections.frequency(list2,each);
         result+=each+frequency;
        }

        System.out.println(result);
        System.out.println(list2);
        System.out.println("------------------------------------");
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,1,1,2,2,3,3,3,4,4,4,5,5,6,6,7,7,8,8,9,9,10,10));

      //  Collections.sort(numbers); // asc
        // Collections.reverse(numbers); //desc
        //5th maximum number;
        int n=5;
        for (int i = 1; i <n ; i++) {
            numbers.removeIf(p-> p==Collections.max(numbers));
        }

        int fifthMaxNumber=Collections.max(numbers);
        System.out.println("fifthMaxNumber = " + fifthMaxNumber);

    }
}
/*
1. write a program that can swap the first and last elements of an ArrayList

2. write a program that can return the first unique elements of an ArrayList

3. write a program that can find the frequency of character from a String
                DO NOT use nested loop
                "AABBCCDDEE"  ==> "ABCDE"
                output: A2B2C2D2E2

4. Write a program that can return the nth largest number from an ArrayList of integers
 */