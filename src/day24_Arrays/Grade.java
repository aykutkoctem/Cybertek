package day24_Arrays;

public class Grade {
    public static void main(String[] args) {
        String [] names = {"Anna", "Nancy", "Sarah","Aykut","Koc","Volkan","nIGAR","EMRE","NECO"};
        int [] scores = {90, 75, 80,85,91,92,93,45,65};
        char [] grades = new char[names.length];
        int countA=0;
        int countB=0;
        int countC=0;
        int countD=0;
        int countF=0;

        int sum=0;

        for (int i=0; i<=grades.length-1; i++){
            //int score= scores[i];
            sum += scores[i];
            if (scores[i]>=90){
                grades[i]='A';
                countA++;
            }else if (scores[i]>=80){ //90
                grades[i]='B';
                countB++;
            }else if (scores[i]>=70){
                grades[i]='C';
                countC++;
            }else  if (scores[i]>=60){
                grades[i]='D';
                countD++;
            }else {
                grades[i]='F';
                countF++;
            }



            System.out.println(names[i]+" score is "+scores[i]+" made "+grades[i]);
        }

        double avg=(double) sum/grades.length;
        System.out.println("Count A = "+countA);
        System.out.println("Count B = "+countB);
        System.out.println("Count C = "+countC);
        System.out.println("Count D = "+countD);
        System.out.println("Count F = "+countF);
        System.out.println(avg);
    }
}
/*
2. given the following arrays:
     String [] names = {"Anna", "Nancy", "Sarah"};
         int [] scores = {90, 75, 80};
         char [] grades = new char[names.length];

         write a program that can store the gardes of the students in the array named grades
 */