package day30_Recap;

public class forEachLoop {
    public static void main(String[] args) {
        int[] numbers={100,200,300,400,500};
        for (int each:numbers){
            System.out.println(each);
        }
        System.out.println("------------------------------");
        int max=numbers[0];
        for (int number : numbers) {
            /*
            if (number>max){
                max=number;
            }

             */
            max=Math.max(number,max);
        }
        System.out.println("max = " + max);
        System.out.println("-----------------------------------------------");
        System.out.println(Math.sqrt(4));
        System.out.println(Math.pow(4,2));
        System.out.println(Math.E);
        System.out.println(Math.PI);
        System.out.println("------------------------------------------");
    }
}
