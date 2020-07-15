package Lesson8;

import java.util.Scanner;

public class Ex2 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String year  = a.substring(0,4);
        String month = a.substring(5,7);
        String day = a.substring(8,10);

        String data = String.format("%s/%s/%s",month, day, year);
        System.out.println(data);

    }
}
