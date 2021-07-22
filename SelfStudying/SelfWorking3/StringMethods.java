package SelfWorking3;

public class StringMethods {
    public static void main(String[] args) {

        String str="Muhtar";
        char ch =str.charAt(0);
        System.out.println("ch=" +ch);

        String word = "Cybertek School";
        char ch1=word.charAt(9);
        System.out.println("ch1 = " +ch1);

        String word2="Java";
        char ch2=word2.charAt(2);
        System.out.println("ch2 = " +ch2);
        System.out.println("---------------------------------");
        String sentence="Hello everyone ,how are you all today?";
        int totalNumberOfChars=sentence.length();
        System.out.println("totalnumberofcharacters = " +totalNumberOfChars);
        // characters= 12345678
            String s1="Cybertek";
          //index=     01234567
        int lastIndex=s1.length()-1; //in order to get last index number wee need to subtract one from the length
        char firstcharacter=s1.charAt(0);
        char lastcharacter=s1.charAt(lastIndex);

        System.out.println("firstCharacter = " +firstcharacter);
        System.out.println("lastCharacter = " +lastcharacter);

        System.out.println("--------------------------");
        String firstName="John";
        String lastName="King";

        String fullName= firstName+ " "+lastName;
         // String fullName2=firstName.concat(" ").concat(lastName);

        System.out.println("----------------------");
        String s="cybertek";
        s =s.toUpperCase();
        System.out.println(s);
        System.out.println("------------------------------------");
        String s2= "JAVA PROGRAMING LANGUAGE";
        s2 = s2.toLowerCase();
        System.out.println(s2);

        String name="muhtar";
        name=name.toUpperCase();
        System.out.println(name);
        name=name.toLowerCase();
        System.out.println(name);

        System.out.println("--------------------------------------");
        String schoolName="             Cybertek School";
        schoolName=schoolName.trim();
        System.out.println(schoolName);
    }
}
