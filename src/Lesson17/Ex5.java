package Lesson17;

import java.time.LocalTime;
import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String time = scanner.nextLine();
        int hour = scanner.nextInt();
        int minutes = scanner.nextInt();

        LocalTime localTime = LocalTime.parse(time).minusHours(hour).minusMinutes(minutes);
        System.out.println(localTime);


    }
}
