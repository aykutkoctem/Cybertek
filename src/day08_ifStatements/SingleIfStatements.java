package day08_ifStatements;

public class SingleIfStatements {
    public static void main(String[] args) {
        String name = "Muhtar";
        int score =45;
boolean passed = score >= 60;
             if ( passed ) {
                 System.out.println( name +" passed the exam");
             }
             if ( score < 60) // or you can say !passed == score < 60
        {
            System.out.println(name +" failed the exam");
        }
    }
}
