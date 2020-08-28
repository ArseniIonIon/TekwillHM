package Lesson17;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();

        LocalDate initial = (LocalDate) LocalDate.of(year, month, 1 );
        LocalDate.of(year, month, 1);

        System.out.println(initial.withDayOfMonth(1));
        System.out.println(initial.withDayOfMonth(initial.lengthOfMonth()));
    }
}
