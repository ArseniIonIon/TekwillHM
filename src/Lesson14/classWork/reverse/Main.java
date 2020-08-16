package Lesson14.classWork.reverse;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            StringReverse reverser = new StringReverse() {
                @Override
                public String reverse(String reverse) {

                    StringBuilder stringBuilder = new StringBuilder(reverse);
                    return stringBuilder.reverse().toString();

                }
            };
            System.out.println(reverser.reverse(line));
        }
    }

