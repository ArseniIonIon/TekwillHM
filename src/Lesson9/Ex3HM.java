package Lesson9;

import java.util.Scanner;

public class Ex3HM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }


    public static long factorial(long a){

        long fact = 1;
        for (int i = 1; i<= a; i++) {
           fact = fact *i;
        }
    return fact;
    }
}
