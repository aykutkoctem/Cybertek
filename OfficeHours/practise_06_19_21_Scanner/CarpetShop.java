package practise_06_19_21_Scanner;

import java.util.Scanner;

public class CarpetShop {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please type one of them \n\t List ofRooms\n1-Bedroom\n2-Kitchen");
        String roomType=scan.nextLine();
        switch (roomType){

            case "Kitchen":
                System.out.println("please enter radius");
                double radius=scan.nextDouble();
                break;
            case "badthroom":
                System.out.println("please enter length");
                double length=scan.nextDouble();
                System.out.println("please enter width");
                double witdh=scan.nextDouble();

                break;
            default:
                System.out.println("invalid room type");
                break;
        }
        System.out.println("please enter your delivery adress");
        String adress=scan.nextLine();


    }
}
