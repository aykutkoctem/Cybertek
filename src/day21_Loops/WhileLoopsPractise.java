package day21_Loops;

public class WhileLoopsPractise {
    public static void main(String[] args) {
        String sentence="Java Java Java Java";


        int countJava=0;
        while (sentence.contains("Java")){
            countJava++;
            sentence=sentence.replaceFirst("Java", "");

        }
        System.out.println("countJava = "+countJava);
    }
}
