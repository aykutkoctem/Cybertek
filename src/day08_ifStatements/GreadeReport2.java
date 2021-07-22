package day08_ifStatements;

public class GreadeReport2 {
    public static void main(String[] args) {
        int score =30;
        boolean madeA = score>= 90 && score <=100;
        boolean madeB = !madeA && score<=80 ;// did not make A and score is greater or equal to 80
        boolean madeC =!madeA && !madeB && score<= 70 ;// did not make A & B  and socre is greater then 70
        boolean madeD =!madeA && !madeB && !madeC && score >= 60; // did not make A, B, C  and score is greater then 60
        boolean madeF =!madeA && !madeB && !madeC && !madeD;
        if(madeA){
            System.out.println(" Excellent, You made an A");
        }
        if (madeB){
            System.out.println(" Good job, you made an B");

        }
        if (madeC){
            System.out.println(" Good, you made an C");

        }
    }

}
