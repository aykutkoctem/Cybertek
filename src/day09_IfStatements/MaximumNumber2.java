package day09_IfStatements;

public class MaximumNumber2 {
    public static void main(String[] args) {
        int a=20;
        int b=20;
        if (a>b){
            System.out.println(a + " is maximum number");
        }else if (b>a){
            System.out.println(b + " is maximum number");
        }else{
            System.out.println("equal");
        }
    }
}
