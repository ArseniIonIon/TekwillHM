package Lesson5;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        printWordsOfLines(userInput);
    }

    public static void printWordsOfLines(Scanner x){
        System.out.println("Enter 0 to quite input");
        int number=0;

        while(x.hasNextInt()){
            int xx = x.nextInt();

            if(xx == 0)
                break;
            else
                number = number+1;

        }
        System.out.println("numers: " + number);

    }
}
