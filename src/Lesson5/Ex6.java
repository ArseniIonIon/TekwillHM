package Lesson5;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Input the beginning and the end of interval");
        int a  = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a; i<= b; i++){

            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }else if (i % 5 == 0){
                System.out.println("Buzz");
            }else if (i % 3 == 0){
                System.out.println("Fizz");
            }else System.out.println(i);

        }
    }
}
