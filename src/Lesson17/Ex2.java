package Lesson17;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.logging.LoggingPermission;

public class Ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();

        int numberOfDayYear = LocalDate.parse(date).getDayOfYear();
        int numberOfDayMonth =  LocalDate.parse(date).getDayOfMonth();

        System.out.println(numberOfDayMonth + " " + numberOfDayYear);
    }
}
