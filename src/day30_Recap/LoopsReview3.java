package day30_Recap;

public class LoopsReview3 {
    public static void main(String[] args) {
        String sentence = "I love Java, Java is fun Java Java Java Java";
        String word = "Java";
        int count = 0;

        while (sentence.contains(word)) {// if the java does not contain yhe world.
            sentence = sentence.replaceFirst(word, "");//replaces the first matching world from sentence.
            count++;
        }

        System.out.println("sentence = " + sentence);
        System.out.println("count = " + count);

        System.out.println("---------------------------------------------------");

        for (int j = 1; j <= 5; j++) {


            for (int i = 1; i <= 10; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------");


        String str = "aabcccccd";
        for (int j = 0; j < str.length(); j++) {


            char ch = str.charAt(j);
            int frequency = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    frequency++;
                }
            }
            if (frequency==1) {
                System.out.println("ch = " + ch);

            }
        }
    }
}