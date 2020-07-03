package Lesson4;

import java.util.Scanner;

public class InputAgeName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        System.out.println("Hi, my name is " + name);
        System.out.println("I am " + age + " years old");
    }
}
