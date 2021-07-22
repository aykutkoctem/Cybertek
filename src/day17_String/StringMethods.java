package day17_String;

public class StringMethods {
    public static void main(String[] args) {
        String sentence="My favorite programming languags are:C#, Java,JavaScript";
        boolean hasPhyton=sentence.contains("Python");
        boolean hasJava=sentence.contains("java");

        System.out.println("hasPython = " +hasPhyton); //false
        System.out.println("hasJava = "+hasJava); //true

        System.out.println("--------------------------------------------------");
        String sentence2="Cybertek School ist the best";
        boolean starWithCybertek= sentence2.startsWith("Cybertek");
        boolean startWithSchool=sentence2.startsWith("School");

        System.out.println("starWithCybertek = " +starWithCybertek);
        System.out.println("StartWithSchool = " +startWithSchool);


        System.out.println("------------------------------------");
        boolean endWithBest = sentence2.endsWith("best");
        System.out.println("endWithBest = " +endWithBest);
    }
}
