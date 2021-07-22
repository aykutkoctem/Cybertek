package day10_IfStatements;

public class CampusHours {
    public static void main(String[] args) {
        int time = 7;
        String result="";
        if (time >= 8 && time<=23){
           // System.out.println("open");
            result="open";
        }else{
           // System.out.println("closed");
            result="closed";
        }
        System.out.println("result ="+result);

    }
}
