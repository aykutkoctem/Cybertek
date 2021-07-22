package SelfWorking1;

public class OrLoginSwitchStatement {
    public static void main(String[] args) {
        int number=4;
        switch (number){
            case 2:
                System.out.println(" has 28 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("has 30 days");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("has 31 days");
                break;
            default:
                System.out.println("invalid");
        }
    }
}
