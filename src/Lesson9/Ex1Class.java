package Lesson9;

import java.util.Scanner;

public class Ex1Class {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(sumInRange(a, b));
    }

    public static long sumInRange(long a, long b) {
        long sum = 0;
        for (long i = a; i < b; i++) {
            sum += i;
        }
        return sum;
    }
}
