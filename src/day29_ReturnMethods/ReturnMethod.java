 package day29_ReturnMethods;

public class ReturnMethod {
    public static void main(String[] args) {
        String str="Java";
        reverse("abc");
        System.out.println(reverse("abc"));
        String reverseStr=reverse(str);
        isPalindrome(str);



    }
    public static String reverse(String str){ //"ABC"
        String result="";

        for (int i = str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);
        }
        return result;
    }
    public static void isPalindrome(String str){
        String reversedStr=reverse(str);
        if (reversedStr.equalsIgnoreCase(str)){
            System.out.println(str+" is palindrome");
        }else {
            System.out.println(str+" is not palindrome");
        }
    }




}
