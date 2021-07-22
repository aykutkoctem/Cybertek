package SelfWorking1;

public class Calculator {
    public static void main(String[] args) {
        double n1=100;
        double n2=2.5;
        char mathOperator='/';
        switch (mathOperator){
            case '-':
                System.out.println(n1-n2);
                break;
            case '+':
                System.out.println(n1+n2);
                break;
            case '*':
                System.out.println(n1 * n2);
                break;
            case '/':
                System.out.println(n1 / n2);
                break;
            default:
                System.out.println("invalid");
        }
    }
}
