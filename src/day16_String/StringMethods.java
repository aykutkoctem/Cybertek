package day16_String;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String email="Cybrtek@yahoo.com";
        email=email.replace("yahoo","gmail"); //Cybrtek@gmail.com

        System.out.println(email);
        String sentence="C# is cool, C# is fun";
        // sentence=sentence.replace("C#","Java");
        sentence=sentence.replaceFirst("C# is f","Java is f"); //replaces the first matching only
        System.out.println(sentence);

        String s =" Cat Dog Cat Dog Cat";
        s=s.replaceFirst("Cat","Dog");
        System.out.println(s);

        System.out.println("------------------------------");
        String sentence2="Java is a cool language";
        int indexOfFirstA=sentence2.indexOf("a");
        int indexOfSecondA= sentence2.indexOf("a ");
        int indexOfThirdA=sentence2.indexOf("a c");
        int indexFourthA=sentence2.indexOf("an") ;
        int indexFifthA=sentence2.lastIndexOf("a");
        System.out.println(indexOfFirstA);
        System.out.println(indexOfSecondA);
        System.out.println(indexOfThirdA) ;
        System.out.println(indexFourthA);
        System.out.println(indexFifthA);

        System.out.println("indexOfFirstA = " +indexOfFirstA);
        System.out.println("indexOfSecondA =" +indexOfSecondA);
        System.out.println("indexOfthirdA = "+indexOfThirdA);
        System.out.println("indexOfForthA =" +indexFourthA);
        System.out.println("indexOfFifthA =" +indexFifthA);

        System.out.println("=================================");
        String s2="   ";
        s2=s2.trim();
        boolean r1=s2.isEmpty();
        System.out.println("r1 = "+r1);

        System.out.println("--------------------------------------------------------------");
        // equal(), or equalsIgnoreCase()

        String str1="Cat"; // string pool
        String str2=new String("Cat"); // java heap
        String str3=new String("Cat");

        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));

        System.out.println(str2==str3);
        System.out.println(str2.equals(str3));
        System.out.println("-------------------------------------");

        String word1="Java";
        String word2="java";
        System.out.println(word1.equals(word2));

        System.out.println(word1.equalsIgnoreCase(word2));




    }
}
