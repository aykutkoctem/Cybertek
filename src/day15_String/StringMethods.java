package day15_String;

public class StringMethods {
    public static void main(String[] args) {
        String str="Muhtar";
        char ch1=str.charAt(0);
        System.out.println("ch1 = " +ch1);

        String word = "Cybertek School";
        //index=       0123456789....
        char ch2= word.charAt(9);
        System.out.println("ch2 = " +ch2);
        //index:       012...
        String word2 ="Java";
        char ch3=word2.charAt(2);
        System.out.println("ch3 = " +ch3);

        System.out.println("-----------------------");
        String sentence="Hello everyone, how are you all today?";
        int totalNumberOfCharachter=sentence.length();
        System.out.println("total Number Of Charachter = " +totalNumberOfCharachter);

        //char:    8
        String S1 ="Cybertek";
        //          01234567
        int lastIndex=S1.length()-1;

        char firstCharachter =S1.charAt(0);
       // char lastCharachter  =S1.charAt(7);
        char lastCharachter=S1.charAt( lastIndex );

        System.out.println("firstCharacter= " +firstCharachter);
        System.out.println("lastCharachter= " +lastCharachter);

        System.out.println("----------------------------");

        String firstName= "John";
        String lastName= "King";
        String fullName= firstName + " " +lastName;
        String fullName2=firstName.concat(" ").concat(lastName);
        System.out.println(fullName2);
        System.out.println("-----------------------");
        String s ="cybertek";
        s=s.toUpperCase(); // "CYBERTEK"
        System.out.println(s);
        System.out.println("--------------------------------------");

        String s2= "JAVA PROGRAMING LANGUAGE";
        s2=s2.toLowerCase();
        System.out.println(s2);
        String name= "muhtar";
        name=name.toUpperCase();

        System.out.println(name);
        name=name.toLowerCase();
        System.out.println(name);

        System.out.println("-----------------------------------");
        String schoolName = "                 Cybertek School";
        schoolName=schoolName.trim();

        System.out.println(schoolName);



    }
}
