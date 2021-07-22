package SelfWorking1;

public class TernaryPractise {
    public static void main(String[] args) {
        double Salary=90000;
        int CreditScore=720;
        String result=(Salary>=60000 && CreditScore>=600)? "Loan approved" :" Loan Denied";
       /* if (Salary>=60000 && CreditScore>=600){
            result="Loan approved";
        }else{
            result="Loan denied";
        }
        System.out.println("result = " +result);

        */
        System.out.println("result = " +result);
        System.out.println("---------------------------------");
        String sport="Golf";
        int price = (sport=="Soccer" || sport=="Tennis")?100:50;
        System.out.println("price = " +price);
        System.out.println("--------------------------------");
        int n1=100;
        int n2=200;
        int n3=300;
        String result2=(n1>n2 && n1>n3)? "n1 is bigger":(n2>n1 && n2>n3)? "n2 is bigger" : "n3 is bigger";

        System.out.println("result2 = " +result2);
        System.out.println("-----------------------------------------");

        int number = 25;
        String name = "";

        if (number >=1 && number<=12){

        name= (number==1)? "jan":(number==2)?"feb":(number==3)?"march":(number==4)?"april":(number==5)?"may"
                :(number==6)?"jun":(number==7)?"july":(number==8)?"aug":(number==9)?"sep":(number==10)?"oct"
                :(number==11)?"november" :"December";


        }else{
            name="invalid";
        }
        System.out.println("name = "+name);
    }
}
