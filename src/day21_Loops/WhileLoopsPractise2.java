package day21_Loops;

public class WhileLoopsPractise2 {
    public static void main(String[] args) {
        int i=0;

        while (i<=10){
            if (i%2==0) {

                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
        System.out.println("-------------------------------------------");
        for (int j=0; j<=10; j++){
            if (j%2==0){
                System.out.print(j + " ");
            }

        }
    }
}
