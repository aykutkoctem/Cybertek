package day07_ShortHand_Relational;

public class RelationalOperators {

    public static void main(String[] args) {
        // >  >=  <  <=   ==   !=
        System.out.println(10 >11); // false
        System.out.println( 10>= 10);
        System.out.println( 11>= 9);
        System.out.println(20>=200);
        // < <=
        System.out.println(1000<100);
        System.out.println(1000<10000);
        System.out.println(10000 <= 1000);
        System.out.println(1000<= 10000);
        // == , =!
        System.out.println(5==6);
        System.out.println(5!=6);

        System.out.println('a' =='A');
        System.out.println('a' == 'A');
        System.out.println( "java" =="Java");
        System.out.println("Java" != "java");

    }

}
