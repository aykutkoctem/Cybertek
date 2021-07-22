package day29_ReturnMethods;

public class SystemExit_VS_Return {

    public static void main(String[] args) {
        passOrFailed(150);
        System.out.println("test completed");
    }


    public static void passOrFailed(int score){
        if (score<0 ||score>100){
            System.out.println("Invalid");
           // System.exit(0);
            return;



        }

        if (score>=60){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
    }


}

