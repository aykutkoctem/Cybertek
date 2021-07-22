package day14_Recap;

import java.util.Scanner;

public class TernaryPractise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1-7 :");
        int number = scan.nextInt();

        String name=(number>=1 && number<=7)?(number ==1)?"monday":(number==2)?"tuesday":(number==3)?"wed":(number==4)?"thurs":
                (number==5)?"fri":(number==6)?"sat":"sunday":"no such a day";
        System.out.println(" name =" +name);

        System.out.println("--------------------");
        String name2="";
        if (number<=1 && number<=7){
            switch (number){
                case 1: name2="monday"; break;
                case 2: name2="tuesday"; break;
                case 3: name2 ="wednesday"; break;
                case 4: name2="thursday"; break;
                case 5: name2="friday"; break;
                case 6: name2="saturday";break;
                default:name2="sunday";break;


            }
        }else{
            name2="no duch a day";
        }
        System.out.println("name2 ="+name2);
        scan.close();
    }
}
