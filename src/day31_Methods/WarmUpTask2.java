package day31_Methods;

public class WarmUpTask2 {
    public static void main(String[] args) {
        String sentence = "Java java JaVA";
        String word = "java";

        int count = 0; //3
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();
        while (sentence.contains(word)) {
            sentence = sentence.replaceFirst(word, "");
            count++;
        }
        System.out.println(count);
    }

    public static int frequencyOfWord(String sentence, String word) {
        int count = 0; //3
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();
        while (sentence.contains(word)) {
            sentence = sentence.replaceFirst(word, "");
            count++;
        }
        return count;
    }
}