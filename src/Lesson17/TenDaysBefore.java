package Lesson17;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class TenDaysBefore {

    public static void main(String[] args) {


        /*Scanner scanner = new Scanner(System.in);
        String date  = scanner.nextLine();

        LocalDate localDate = LocalDate.parse(date).minusDays(10);
        System.out.println(localDate);*/

        /*Scanner scanner1 = new Scanner(System.in);
        int seconds  = scanner1.nextInt();

        LocalTime localTime = LocalTime.ofSecondOfDay(seconds);
        System.out.println(localTime);*/

        Scanner scanner = new Scanner(System.in);
        String date  = scanner.nextLine();

        LocalDateTime localDate = LocalDateTime.parse(date).plusHours(7);
        LocalDate date1 = localDate.toLocalDate();
        System.out.println(date1);


    }
}
