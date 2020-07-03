package Lesson4;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        int a,b,c;
        boolean result;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if (a!= b && a!=c && b!=c){
            result = true;
        }else result = false;

        System.out.println(result);
    }
}
