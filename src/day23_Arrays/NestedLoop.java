package day23_Arrays;

public class NestedLoop {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("---------------------------------------");
        for (int j=8; j<=10; j++){ //otter loop
            for (int i=1; i<=5; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
