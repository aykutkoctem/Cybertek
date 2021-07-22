package day19_Loops;

public class forLoopsIntro {
    public static void main(String[] args) {
for (int i =0; i<=100; i++){ // i:0123456....1000
    System.out.print(i+" ");
}
        System.err.print("Hello"); // to make sure next print statement starts from new line
        System.out.print("-----------------------------------------------------");
        for (int i=1; i<=100; i++){
            if (i%2 !=0){
                System.out.print(i +" ");
                System.out.println();
                System.out.println("------------------------------------");
                for (int i1= 0; i1<=100; i1+=2){
                    System.out.print(i1+" ");
                }
                System.out.println();
                System.out.println("-------------------------------------------");
                for (int i2=1; i2<101;i2++ ){
                    if (i2%2 ==0){
                        System.out.print(i2+" ");
                    }
                }
            }
        }

        System.out.println("-------------------------");
        for (int i = 1 ; i<101; i++){

        }
    }
}
