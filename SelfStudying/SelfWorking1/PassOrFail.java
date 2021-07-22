package SelfWorking1;

public class PassOrFail {
    public static void main(String[] args) {
        char grade ='A';
        switch (grade){
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                System.out.println("passed");
                break;
            case 'F':
                System.out.println("not passed");
                break;
            default:
                System.out.println("invalid");

        }
    }
}
