package Lesson9;

import java.util.Scanner;

public class Ex1HM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d = scanner.nextDouble();
        System.out.println(extractInt(d));

    }

    public static int extractInt(double d){
        return ((int) d);
    }
}
