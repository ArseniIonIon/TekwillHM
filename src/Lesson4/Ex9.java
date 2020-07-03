package Lesson4;

import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {
        int a,b,c;
        boolean result;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if (a > 0 && b <=0  && c <=0){
            result = true;
        }else if (b > 0 && a <=0  && c <=0){
            result = true;
        }else if (c > 0 && a <=0  && b <=0){
            result = true;
        }else result = false;

        System.out.println(result);
    }
}

