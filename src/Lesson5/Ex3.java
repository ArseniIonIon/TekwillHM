package Lesson5;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt() ; // it's initialized by a value
        System.out.println(num % 2 == 0 ? "even" : "odd");
    }
}
