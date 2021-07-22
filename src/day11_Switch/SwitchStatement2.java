package day11_Switch;

public class SwitchStatement2 {
    public static void main(String[] args) {
        String name= "chrome";
        switch (name){

            case "chrome":
                System.out.println("Chrome Browser is selected");
                break; //case closed
            case "firefox":
                System.out.println("Firefox browser is selected");
                break;
            case "edge":
                System.out.println("Edge Browser is selected");
                break;
            default:
                System.err.println("Invalid");

        }
    }
}
