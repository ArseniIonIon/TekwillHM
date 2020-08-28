package Lesson17;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalDate date = LocalDate.parse(scanner.nextLine());
        int days  = scanner.nextInt();

        LocalDate date1 = date.plusDays(days);
        System.out.println((date.getYear() < date1.getYear()));

    }
}
