package day19_Loops;

public class forLoopsPractise {
    public static void main(String[] args) {
        for (int i=0; i<=100; i++){
            System.out.print(i+" ");
        }
        System.out.println();// to make sure next print statements starts from new line
        System.out.println("------------------------------------------------------------");
        for (int i=1; i<=100; i++){
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("---------------------------------------------------------");
        for (int i=1; i<=100; i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("-------------------------------------------------");
        for (int i=1; i<101; i++){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("----------------------------------------------------------");
        String odds="";
        String evens="";
        for (int i=1; i<101; i++){
            if (i%2!=0){
                odds+=i+" ";
            }else {
                evens+=i+" ";
            }
        }
        System.out.println("odds= "+odds);
        System.out.println("evens= "+evens);
    }
}
