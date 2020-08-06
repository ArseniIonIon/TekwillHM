package Lesson11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        System.out.println(Math.pow(a,b));

        for (DayOfWeek dayOfWeek: DayOfWeek.values()
             ) {
            System.out.println(dayOfWeek);
        }
    }
}
