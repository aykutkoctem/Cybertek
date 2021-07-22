package day10_IfStatements;

public class NameOfMonth {
    public static void main(String[] args) {
        int number=10;
        String name="";
        if (number==1){
            name="jan";
        }else if (number==2){
            name="feb";
        }else if (number==3){
            name="march";
        }else if (number==4){
            name="april";

        }else if (number==5){
            name="may";
        }else if (number==6){
            name="june";
        }else if (number==7){
            name="july";
        }else if(number==8){
            name="aug";
        }else if (number==9){
            name="sep";
        }else if (number==10){
            name="oct";
        }else if (number==11){
            name="nov";
        }else{
            name="december";
        }
        System.out.println("name = "+name);
    }
}
