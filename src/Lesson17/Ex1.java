package Lesson17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String date = scanner.nextLine();
        LocalDate dateBefore30years = LocalDate.parse(date).plusYears(30);
        LocalDate dateAfter30years = LocalDate.parse(date).minusYears(30);

        System.out.println(dateBefore30years+ "\n" + dateAfter30years);

    }
}
