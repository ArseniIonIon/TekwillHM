package Lesson4;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        boolean result;
        int a;
        Scanner scanner = new Scanner(System.in);
        a =  scanner.nextInt();

        if (a >0 && a<10){
            result = true;
        }else {
            result = false;
        }
        System.out.println(result);
    }
}
