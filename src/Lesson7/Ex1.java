package Lesson7;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.next();
        String replaceAfromB = text.replace('a','b');
        System.out.println(replaceAfromB);
    }
}
