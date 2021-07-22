package day23_Arrays;

public class MyClassMates {
    public static void main(String[] args) {
        // if we know what are the elements are

        String[] friends={"Volkan","Anil","Alican","Onur","Necati"};  //size is 5
        System.out.println("Size: "+friends.length);

        for (int i=0; i<=friends.length-1; i++){
            System.out.println(friends[i] );
        }


        System.out.println("------------------------------------------------------");

        // if we do not know what are the elements are but we do know how many elements we want to store
        String[] friends2=new String[5];
        System.out.println("Size: "+friends2.length);

        friends2[1]="Alican";
        friends2[4]="Anil";
        friends2[2]="Volkan";
        friends2[3]="Kamil";
        friends2[0]="Necati";


        for (int i=0; i<=friends2.length-1; i++){
            System.out.println(friends2[i]);
        }
    }
}
