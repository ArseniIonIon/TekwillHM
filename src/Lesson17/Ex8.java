package Lesson17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Ex8 {

        public static LocalDateTime merge(LocalDateTime dateTime1, LocalDateTime dateTime2) {

            int year, month, day, hour, minutes;

            if (dateTime1.getYear() > dateTime2.getYear()){
                year = dateTime1.getYear();
            }else { year = dateTime2.getYear();}
            if (dateTime1.getMonthValue() > dateTime2.getMonthValue()){
                month = dateTime1.getMonthValue();
            }else { month = dateTime2.getMonthValue(); }
            if (dateTime1.getDayOfMonth() > dateTime2.getDayOfMonth()){
                day = dateTime1.getDayOfMonth();
            }else { day = dateTime2.getDayOfMonth(); }
            if (dateTime1.getHour() > dateTime2.getHour()){
                hour = dateTime1.getHour();
            }else { hour = dateTime2.getHour(); }
            if (dateTime1.getMinute() > dateTime2.getMinute()){
                minutes = dateTime1.getMinute();
            }else {minutes = dateTime2.getMinute();}

                LocalDate date = LocalDate.of(year,month,day);
                LocalTime time  =  LocalTime.of(hour, minutes,dateTime2.getSecond());
            return LocalDateTime.of(date,time);
        }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final LocalDateTime firstDateTime =
                LocalDateTime.parse(scanner.nextLine());
        final LocalDateTime secondDateTime =
                LocalDateTime.parse(scanner.nextLine());
        System.out.println(merge(firstDateTime, secondDateTime));
    }

}




