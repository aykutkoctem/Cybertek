package day18_Recap;

public class StringMethodsPractise {
    public static void main(String[] args) {
        String str="abcd";
        int indexofK=str.indexOf("k");
        System.out.println("indexOfK= " +indexofK);

        if (indexofK>=0){
            System.out.println("the string has character k");
        }else{
            System.out.println("the string does not have k");
        }
        System.out.println("-------------------------------------------------");
        String sentence="I like to learn C#,C# is cool J";
        //verify if the sentence has"java"
        if (sentence.indexOf("J")>=0){
            System.out.println("sentence has java");
        }else {
            System.out.println("Sentence does not have java");
        }
        System.out.println("------------------------------------------------------------");
        String sentence2 = "I love Java, Java is cool";
        //                         7     13
        boolean isUnique=sentence2.indexOf("Java")==sentence2.lastIndexOf("Java");
                          // 7                    == 13 ==>false
        System.out.println(isUnique);
        System.out.println("---------------------------------------------------");
        String schoolName="Cybertek School";



        String name=schoolName.substring(0,schoolName.indexOf(" "));
        System.out.println("name = "+name);

        String sentence3="I live in California,I go to Cybertek school   ";
        String name3=sentence3.substring(sentence3.indexOf("Cy"), sentence3.lastIndexOf(" school"));
        System.out.println("name3 = "+name3);

        System.out.println("--------------------------------------------------");
        String str2="Dog Cat Dog Cat";
        str2 =str2.replace("Cat","Dog");
        System.out.println(str2);
        str2=str2.replaceFirst("Dog","Cat");
        System.out.println("str2 = "+str2);
        String sentence4="Java Java Java";
        sentence4=sentence4.replaceFirst("Java","C#").replaceFirst("Java","Pyhton"); //"C# Java Java"
        System.out.println(sentence4);
        sentence4=sentence4.replace("Java Java","C# Python");
        System.out.println(sentence4);
        System.out.println("--------------------------------------------------");

        System.out.println("Yes".equals("yes"));
        System.out.println("Yes".equalsIgnoreCase("yes"));



    }
}
