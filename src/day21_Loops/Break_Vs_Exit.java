package day21_Loops;

public class Break_Vs_Exit {
    public static void main(String[] args) {
        for (int i=0; i<5; i++){
            if (i==3){
               // break;
                System.exit(0);
            }
            System.out.println("Cybertek School");
        }
        System.out.println("Batch 23");
    }
}
