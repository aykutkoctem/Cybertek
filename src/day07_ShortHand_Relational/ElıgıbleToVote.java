package day07_ShortHand_Relational;

public class ElıgıbleToVote {
    public static void main(String[] args) {
        String name = "Conor McGregor";
         int age= 35;
         String citizen ="USA";
         int creditscore = 750;
         boolean eligableToVote = age>= 18 && citizen =="USA" && creditscore >= 700;


        System.out.println( name +"is eligible to vote for Biden: " +eligableToVote);
    }
}
