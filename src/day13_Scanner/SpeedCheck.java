package day13_Scanner;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
        int speedLimit=35;
        System.out.println("Enter your current speed");
        int currentSpeed= new Scanner(System.in).nextInt();
        System.out.println("current speed = " +currentSpeed);
        int overSpeedLimit= currentSpeed - speedLimit;
        if (overSpeedLimit>0){
            System.out.println("you are driving " +overSpeedLimit + " miles over speed limit. slow down");
        }

    }
}
