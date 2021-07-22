package day20_Loops;

public class BranchIfStamemnt {
    public static void main(String[] args) {
        for (int i=0; i <=5; i++){
            if(i==3){
                break;
            }
            System.out.println(i);
        }

        System.out.println("-----------------------------------------------------------------------");

        for (int i=0; i<=5; i++){
            if (i==3){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("------------------------------------------------------------------------");

for (int i=1; i<11; i++){
    if (i%2==0){
        continue;
    }
    System.out.println(i);
}
        System.out.println("---------------------------------------------------------------------------");

      for (int i=1; i<=100; i++){
          if (i %15==0){
              continue;
          }
          System.out.print(i+" ");
      }
        System.out.println("----------------------------------------------------------------------------");
      // print all the alphabet between a to z except for d,t,x

        for (char i='A'; i<='Z'; i++){
            if (i=='D' || i=='T' || i=='X')
                continue;

            System.out.print(i+" ");
        }

        }
}
