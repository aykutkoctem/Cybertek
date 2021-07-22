package day08_ifStatements;

public class LogıcalOperators {
    public static void main(String[] args) {

        System.out.println( !true ); // false
        System.out.println(!false );//true
        System.out.println(true==false );
        System.out.println(true==!false); //true== true
        System.out.println(true != !false);

        System.out.println("-------------------------------");
        int score = 80;
        boolean passed = score >= 60;
        //boolean failed = score < 60;
        boolean failed =!passed ;


        System.out.println("--------------------------");
        int age= 21;

        boolean eligible = age >= 21;
        boolean noteligible = !eligible;

    }
}
