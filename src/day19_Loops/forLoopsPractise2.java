package day19_Loops;

public class forLoopsPractise2 {
    public static void main(String[] args) {
        //A-Z
        for (int i =65; i<91; i++){
            System.out.print( (char)i+" ");
        }
        System.out.println();
        System.out.println("Hello");
        System.out.println("------------------------------------------------------");
        //A-Z
        for (char i ='A'; i<='Z'; i++){

            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("---------------------------------------------");
        for (char i ='z'; i>='a'; i--){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("---------------------------------");
        //print the characterss from 1000 - 30000 in same line seperated by a space
        for (char i=1000; i<= 30000; i++){
            System.out.print(i+" ");
        }
    }
}
