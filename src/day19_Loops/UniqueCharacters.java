package day19_Loops;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str="aabcc";
        String result="";
        for (int i=0; i<= str.length()-1; i++){
            char ch =str.charAt(i);
            boolean isunique=str.indexOf(ch)==str.lastIndexOf(ch);
            if (isunique){
                result+=ch;
            }

        }


        //                     0                  1
        System.out.println("reesult = "+result);

    }
}
