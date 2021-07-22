package SelWorking4;

public class StringMethodsPractise {
    public static void main(String[] args) {
        String str="abcd";
        int idexOfK=str.indexOf("c");
        System.out.println(idexOfK);

        if (idexOfK>=0){
            System.out.println("the string has character k");
        }else {
            System.out.println("the string does not have k");
        }
        System.out.println("-----------------------------------------");
        String sentence="I like to learn C#, C# is cool";
        if (sentence.indexOf("Java")>=0){
            System.out.println("sentence has java");
        }else {
            System.out.println("sentence does not have java");
        }
        System.out.println("-----------------------------");
        String sentence2="I love Java, C# is cool";
        boolean isunique=sentence2.indexOf("Java")==sentence2.lastIndexOf("Java");
        System.out.println("isuniqe = "+isunique);

        System.out.println("-------------------------");
        String schoolName=" Cybertek School";
        String name=schoolName.substring(0 );
        System.out.println(name);

        String sentence3="I live in Virginia,I go to Cybertek school";
        String name3=sentence3.substring(sentence3.indexOf("C"),sentence3.lastIndexOf(" "));
        System.out.println(name3);
        System.out.println("---------------------------------------");
        String str2 = "Dog Cat Dog Cat";
        System.out.println(str2);
        str2=str2.replace("Cat","Dog");
        System.out.println(str2);
        str2=str2.replaceFirst("Dog","Cat");
        System.out.println(str2);
        String sentence4="Java Java Java";
        sentence4=sentence4.replace("Java Java ","C# Python");

        sentence4=sentence4.replaceFirst("Java","C#").replaceFirst("Java","Python");
        System.out.println(sentence4);

        System.out.println("----------------------------------------------------");
        System.out.println("Yes".equals("yes"));
        System.out.println("Yes".equalsIgnoreCase("yes"));
    }
}
