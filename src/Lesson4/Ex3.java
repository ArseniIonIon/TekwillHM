package Lesson4;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int n,m,s = 0;

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        while(n > 0){
            m = n %10;
            s = s+ m ;
            n = n /10;
        }
        System.out.println(s);

    }
}
