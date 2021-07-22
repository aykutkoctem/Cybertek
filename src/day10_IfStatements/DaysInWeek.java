package day10_IfStatements;

public class DaysInWeek {
    public static void main(String[] args) {
        int number =1;
        String name="";

        if (number >=1 && number <=7){

        }
        if (number==1){
            name="Monday";
        }else if (number== 2){
            name="Tuesday";
        }else if (number== 3){
            name="wednesday";
        }else if (number== 4){
            name="Thursday";
        }else if (number== 5){
            name="Friday";
        }else if (number== 6){
            name="Saturday";
        }else  {
            name="Sunday";
        }
        System.out.println("name = " +name);
        name =(number==1)? "Monday":(number==2)? "Tuesday":(number==3)? "WED":(number==4)? "thurs":(number==5)?"FRIYDAY":
                (number==6)? "sat":"sunday";
    }
}
