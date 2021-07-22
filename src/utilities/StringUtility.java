package utilities;

import java.util.Arrays;

public class StringUtility {

    public static String reverse(String str) { //"ABC"

        String reverse="";
        for (int i = str.length()-1; i>=0 ; i--) {
           reverse+= str.charAt(i);
        }
        return reverse;
    }
    public static boolean isPalindrome(String str){
        String reversedStr=reverse(str);
        return str.equalsIgnoreCase(reversedStr);

    }
    //heart earth ==> isAnagram=true
    public static boolean isAnagram(String str1,String str2){
        char[] ch1=str1.toCharArray();//{'h','e','a','r','t'}
        char[] ch2=str2.toCharArray();//{'e','a','r','t','h'}
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }
    public static String removeDup(String str){ //AABBBCC
        String result=""; //ABC

        for (char ch : str.toCharArray()) { //{'A' ,'A' ,'B','B', 'B', 'C','C'
            if (result.indexOf(ch)<0){ // !result.contains(""+ch)
                //if the character is not contained in the result,then concate the character
                result+=ch;
            }
        }


        return result;
    }
    public static int frequency(String str, char ch) {
        int count = 0;
        for (char each : str.toCharArray()) {//each:represents each character of str
            if (each == ch) {
                count++;
            }
        }

        return count;
    }
    //returns unique characters from the string
    public static String uniqueChars(String s) {
        String unique = "";
        for (int i = 0; i < s.length(); i++) {

            char each = s.charAt(i);
            int frequency = frequency(s, each);
            if (frequency == 1) {
                unique += each;
            }

        }
        return unique;
    }
    public static String frequencyOfChars(String str) {
        String result = ""; //A3B2C4

        for (char each : removeDup(str).toCharArray()) { // each: A, B C
            int frequency = frequency(str, each); // gets the frequency of each character: 3, 2, 4
            result += each; //"ABC"
            result += frequency;//"A3B2C4"
        }

        return result;
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
