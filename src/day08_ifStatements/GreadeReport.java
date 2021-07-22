package day08_ifStatements;

public class GreadeReport {
    public static void main(String[] args) {
        int score = 85;
        if (score >= 90 && score <= 100) {
            System.out.println(" Excellent, You made an A");
        }
        if (score >= 80 && score < 89) {
            System.out.println(" Good job, you made an B");
        }
        if (score >= 70 && score < 79) {
            System.out.println(" Good, you made an C");
        }
        if (score >= 60 && score < 69) {
            System.out.println("  you made an D");
        }
        if (score < 60) {
            System.out.println("Failed");
        }
    }
    }
/*
A: 90 <= SCORE <=100
B: 80 <= SCORE <=89
C: 70 <= SCORE <=79
D: 60 <= SCORE <=69
E


 */