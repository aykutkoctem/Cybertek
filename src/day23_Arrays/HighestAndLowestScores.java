package day23_Arrays;

public class HighestAndLowestScores {
    public static void main(String[] args) {
        int[] scores={85,70,95,90,100,110,40};
        String[] names={"Mike","Adaam","Tonny","John","Ammy","Aykut","kerim"};

        int maxScores=scores[0];
        String maxName="";
        int minScores=scores[0];
        String minName="";

        for (int i=0; i<=names.length-1; i++){
            String eachNames=names[i];
            int eachScores=scores[i];

            System.out.println( names[i]+": " +scores[i] );

            if (eachScores>maxScores){
                maxScores=eachScores;
               maxName=eachNames;
            }

            if (eachScores<minScores){
                minScores=eachScores;
                minName=eachNames;
            }

        }
        System.out.println("Max scores = "+maxScores);
        System.out.println("Max names = "+maxName);
        System.out.println("Min scores = "+minScores);
        System.out.println("Min names = "+minName);
    }
}
