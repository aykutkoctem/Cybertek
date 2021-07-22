package practise_06_09_21;

public class Ternary {
    public static void main(String[] args) {
        int a=5;
        int b=10;
        int r= a>b?a:b;
        System.out.println(r);


        System.out.println("--------------------");
        int age=17;
        int weight=51;



        String result=( age>=18)?(weight>50)?"you are eligible to donate blood"  :"you are not eligible to donate blood":"Age must be greater then 18";
        System.out.println("result =" +result);
    }
}
