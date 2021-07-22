package day34_LocalDateTime_Wrapper;
import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTimeIntro {
    public static void main(String[] args) {
        LocalTime NOW=LocalTime.now();



        System.out.println(NOW);
        LocalTime breakTime=NOW.plusMinutes(15);
        System.out.println(breakTime);
        LocalTime quizDue=breakTime.plusMinutes(20);
        System.out.println(quizDue);
    }
}
