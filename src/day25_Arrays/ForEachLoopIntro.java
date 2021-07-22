package day25_Arrays;

public class ForEachLoopIntro {

    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5};

        for (int i = 0; i <numbers.length ; i++) {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        System.out.println("----------------------------------------------------");

        for (int each : numbers) {
            System.out.print(each+" ");
        }
        System.out.println();

        System.out.println("----------------------------------------------");
        String[] names={"Aykut","Anil","Alican","Necati","Utku"};
        for (String eachName : names) { // there is no index in for each loop
            System.out.println(eachName);
        }
        // we can use for each loop if you dont need to indexes
    }
}
