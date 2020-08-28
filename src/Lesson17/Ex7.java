package Lesson17;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String date = scanner.nextLine();
        int days = scanner.nextInt();
        int hour = scanner.nextInt();

        LocalDateTime localDateTime = LocalDateTime.parse(date).plusDays(days).minusHours(hour);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        System.out.println(localDateTime.format(formatter));
    }
}
