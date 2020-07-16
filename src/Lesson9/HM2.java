package Lesson9;

import java.util.Scanner;

public class HM2 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            char letter = scanner.nextLine().charAt(0);
            System.out.println(isVowel(letter) ? "YES" : "NO");

    }


    public static boolean isVowel(char a) {

        switch (a) {
            case 'A':
                break;
            case 'E':
                break;
            case 'I':
                break;
            case 'O':
                break;
            case 'U':
                break;
            case 'a':
                break;
            case 'e':
                break;
            case 'i':
                break;
            case 'o':
                break;
            case 'u':
                break;
            default:
                return false;
        }
    return true;}
}
