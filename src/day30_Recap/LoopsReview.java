package day30_Recap;

public class LoopsReview {
    public static void main(String[] args) {
        for (int i=1; i<=11; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("---------------------------------------------------------------");
        for (int i = 1; i <=20 ; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("--------------------------------------------");
        for (int i = 1; i <=20 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("-----------------------------------------");
        String str="Java";
        for (int i=str.length()-1; i>=0;i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();
        System.out.println("-----------------------------------------------");
        for (int i = 1, ch=65; i<=26; i++,ch++) {
            System.out.println(i+". "+(char)ch);
        }
        System.out.println("----------------------------------------");
        for (int i = 26,ch=90; i >=1 ; i--,ch--) {
            System.out.println(i+". "+(char)ch);

        }
        System.out.println("-------------------------------------------");

        for (char i = 'A',j='a'; i <='Z' ; j++,i++) {
            System.out.println(i+" "+j);
        }
        System.out.println("--------------------------------------");
        String world="Python";
        //            012345
        String reverse=""; //
        for (int i = world.length()-1; i >=0 ; i--) {
          reverse+= world.charAt(i);
        }
        boolean isPalondrome=world.equals(reverse);
        System.out.println("isPalondrome = " + isPalondrome);
    }

}
