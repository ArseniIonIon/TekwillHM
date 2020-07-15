package Lesson5;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int sum = x;

        while(x!=0){
            if (sum >= 1000){
                sum -= 1000;
                break;
            }
            x = scanner.nextInt();
            sum += x;
        }
        System.out.println(sum);
    }
}
