package day34_LocalDateTime_Wrapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDatePractise {
    public static void main(String[] args) {

        String[] clasmates={"AYKUT","GIZEM","MERT","ALI","DENIZ"};
        LocalDate[] DOB={ LocalDate.of(1987,10,10),
                          LocalDate.of(2000,1,1),
                          LocalDate.of(1991,1,9),
                          LocalDate.of(1993,6,17),
                          LocalDate.of(1990,3,20) };

        LocalDate youngest=DOB[0];
        int index=0;
        for (int i = 0; i < DOB.length; i++) {
            if (DOB[i].isAfter(youngest)){
                youngest=DOB[i];
                index=i;
            }
            if (DOB[i].isLeapYear()){
                System.out.println(clasmates[index]);


            }
        }
        System.out.println("youngest = " + youngest);
        System.out.println(clasmates[index]);
        System.out.println("--------------------------------------------------");
        DateTimeFormatter DF=DateTimeFormatter.ofPattern("EEEE, MMM/dd/YYYY");
        for (int i = 0; i <clasmates.length ; i++) {
            System.out.println(clasmates[i]+" was born on "+DOB[i].format(DF));
        }
    }
}
/*
Task:
    1. create string array to have 5 of your classmate's names

    2. create an array that contains thier DofB

    3. find out who is the youngest person

    4. find out who was born on leap year
 */