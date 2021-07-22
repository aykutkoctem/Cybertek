package practise_06_19_21_Scanner;

import java.util.Scanner;

public class EstimatedOfTimeCalculater {
    public static void main(String[] args) {
        Scanner userInput=new Scanner(System.in);
        System.out.println("Please enter your speed");
        int carSpeed= userInput.nextInt();
        if (carSpeed<=40 || carSpeed>80){
            carSpeed=60;
            System.out.println("it is not allowed your speed is 60");
        }
userInput.nextLine();
        System.out.println("Please enter starting point");
        String startingPoint= userInput.nextLine();

        System.out.println("please enter destination point");
        String destination=userInput.nextLine();

        System.out.println("please enter your distance between " +startingPoint +"to" +destination);
        double distance=userInput.nextDouble();

        double estimateTime=distance/carSpeed;

        System.out.println("the estimated time of arrivel" +estimateTime +"hours from" +startingPoint +"to " +destination);
    }
}
/*
   							Assume that you have a plan to go from A to B point
   							maxSpeed=80
   							minSpeed=40

   							- Ask the User
   								- Car speed
   											should be 40 - 80 mph
   										-> if user enters smaller than minSpeed
   																or
   													 	   bigger than maxSpeed
   										-   assign for speed 60 as default
   										-   otherwise assign for speed userInput(int)

   								- startingpoint(string) and destination(string)
   								- distance between this two points(double)

   								According to this information calculate triptime;

   								Formula of estimatedTime = distance/speed;

   							   	Ex :

   										Inputs :50,San Antonio,Dallas,300

   										"The Estimated Time Of Arrival is 6.0 hours from San Antonio to Dallas "
 */