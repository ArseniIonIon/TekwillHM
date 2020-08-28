package Lesson17;

import java.time.LocalTime;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String time1 = scanner.nextLine();
        LocalTime time1Parsed = LocalTime.parse(time1);
        String time2 = scanner.nextLine();
        LocalTime time2Parsed = LocalTime.parse(time2);

        System.out.println(getDifference(time1Parsed, time2Parsed));
    }


    public static int getDifference(LocalTime time1, LocalTime time2){
        int localTime = 0;

        if(time1.isBefore(time2)){
            localTime = time2.toSecondOfDay() - time1.toSecondOfDay();
        }else {
            localTime = time1.toSecondOfDay() - time2.toSecondOfDay();
        }

        return localTime;

    }
}
