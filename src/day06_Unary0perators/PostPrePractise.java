package day06_Unary0perators;

public class PostPrePractise {

    public static void main(String[] args) {
        int a = 1;// a=1-1=0+1=1
        a = -a-- + a++ / -a-- * --a;
        //  -1   +  0 /  -1   *  -1
        //-1 + 0 * -1
        //-1 +0
        //-1
        System.out.println("a = " +a);
        int x = 10;
        x=++x - x-- + x++ + --x;
        //11  - 11  + 10  +  10
        //= 0+10+10=20
        System.out.println("x = " +x);

        int y = 50;
        int z =-y++  + --y  -  ++y  +  y--;
        //z =  -50   +  50  -  51   +  51
        //z =0
        System.out.println("z = " +z);

    }


}
