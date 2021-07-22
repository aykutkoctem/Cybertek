package day30_Recap;

public class branchIfStatement {
    public static void main(String[] args) {
        for (int i = 0; i <=5 ; i++) {
            if (i==3){
                //break; //exit the loop only
               // return; //exits the method
                continue;
            }
            System.out.println(i);
        }
    }
}
