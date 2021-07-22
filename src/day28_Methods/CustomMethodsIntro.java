package day28_Methods;

public class CustomMethodsIntro {
    public static void main(String[] args) {
        printHello5times();
        System.out.println("Aykut");
          printHello5times();
        System.out.println("Cybertek");
        printHello5times();
        cube(3);
    }

    public static void printHello5times(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("Hello");
        }

    }
    public static void cube(int n){
        System.out.println(n*n*n);
    }
}
