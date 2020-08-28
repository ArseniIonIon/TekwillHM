package Lesson17;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        int minutes  = scanner.nextInt();

        LocalDateTime dateTime = LocalDateTime.parse(date).plusMinutes(minutes);

        System.out.println(dateTime.getYear()+ " " + dateTime.getDayOfYear() + " " +  dateTime.getHour() + " " + dateTime.getMinute()+
                " " +  dateTime.getSecond());

    }
}
