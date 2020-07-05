package Lesson5;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int i = 1;
        while (i*i <= a){
            System.out.println(i*i);
            i = i +1;
        }
    }
}
