package SelfWorking1;

public class SwitchStatement2 {
    public static void main(String[] args) {
        String name="chrome";
        switch (name){

            case "aykut":
                System.out.println("chrome is selected");
                break;
            case "firefox":
                System.out.println("firefox is selected");
            default:
                System.err.println("invalid");
        }
    }
}
