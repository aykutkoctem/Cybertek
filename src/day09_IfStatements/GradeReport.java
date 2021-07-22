package day09_IfStatements;

public class GradeReport {
    public static void main(String[] args) {
        int score= 40;
        if (score>=90 && score<100){ // FALSE: score<90
            System.out.println("You made A");
        }else if (score>=80 ){ //false :score <80
            System.out.println("B");
        }else if (score>=70){
            System.out.println("C");
        }else if (score>=60){
            System.out.println("D");
        }else {
            System.out.println("F");
        }

    }
}
