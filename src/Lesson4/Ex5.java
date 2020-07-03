package Lesson4;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        int distance ;
        int hour ;
        double result;

        Scanner scanner = new Scanner(System.in);
        distance = scanner.nextInt();
        hour = scanner.nextInt();

        result = distance/hour;

        System.out.println(result);
    }
}
