package day06_Unary0perators;

public class UnaryOperators {
    public static void main(String[] args) {

        int a =100;
        System.out.println("a = " +a );
        int b = 100;
        --b;
        System.out.println("b = "+ b);
        int x = 10;
        //System.out.println( ++x); // change the value by 1 immediately
        System.out.println( x++);   // 10 post: first passes the current value, then change the value by 1

        System.out.println("-------------------------------");

        int n1 = 50;
        int n2 = n1++;
        //n2 =50, n1=51

        System.out.println("n1 = " +n1);
        System.out.println("n2 = " +n2);

        int a1 = 100;   //101
        int a2 =++a1;
        // a2 = 101, a1=101
        System.out.println("" +
                "" +
                "");


    }
}
