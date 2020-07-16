package Lesson9;

import java.util.Scanner;

public class Ex2Class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int val = scanner.nextInt();
        print(str);
        print(str, val);


    }

    public static void print(String string){
        System.out.println("print(\""+ string + "\")");
    }

    public static void print(String string, int number){
        System.out.println("print(\""+ string + "\")" + number);
    }
}
