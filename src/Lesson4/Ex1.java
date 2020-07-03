package Lesson4;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] integers = new int[3];
        for(int i = 0; i < 3; i++)
        {
            integers[i] = sc.nextInt();
        }

        for(int j = 0; j<integers.length; j++){
            System.out.println(integers[j]);
        }
    }
}
