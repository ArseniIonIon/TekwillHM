package Lesson6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LongArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i =  scanner.nextInt();
        int [] intArray = new int[i];

        for (int m = 0; m<intArray.length; m++){
            intArray[m] = scanner.nextInt();
        }

        int sum = 0;
        for (int j= 0; j<intArray.length; j++){
            sum = sum + intArray[j];
        }

        System.out.println(sum);

    }
}
