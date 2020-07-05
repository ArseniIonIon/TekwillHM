package Lesson5;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter some numbers between 1 and 8.");
        String input = userInput.nextLine();
        System.out.println(input.split(" ").length); //Count inputs
        userInput.close();
    }
}
