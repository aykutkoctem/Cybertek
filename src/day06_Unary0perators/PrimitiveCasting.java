package day06_Unary0perators;

public class PrimitiveCasting {
    public static void main(String[] args) {

        byte a =10;
        long b =a;   // implicit casting. automatically done

        double d= 10.0;
        int f = (int)(long)d ; //explicit casting/
        System.out.println("-----------------------------");

        long n = 100;
        int m= (int)n;
        float q = 2.5f;
        int u = (int)q;
        long r = (long) q;
        short s= (short) q;

        System.out.println( (double)2.5f );
        System.out.println((double) 10L );
        int w =129;
        byte z = (byte) w;
        System.out.println("z = "+ z);
        int e = 70000;
        short g = (short) e;

        System.out.println("g = " +g);

        System.out.println("---------------------");

        double num1 = 100.0;
        int num2 = (int) num1;

        System.out.println("num2 = " +num2);
        System.out.println("num1 = " +num1);

        System.out.println(  (int)100.23456 ); // 100









    }
}
