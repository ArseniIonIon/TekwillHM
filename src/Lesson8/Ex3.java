package Lesson8;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input your string:");
        String inputText = scanner.nextLine();
        System.out.print("Input pattern: ");
        String pattern = scanner.nextLine();

        int patterTimes = (inputText.length() - inputText.replace(pattern,"").length()) /pattern.length();
        System.out.println(patterTimes);
    }
    }


