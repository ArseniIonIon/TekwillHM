package Lesson8;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name  =  scanner.nextLine();

        char [] charArray = name.toCharArray();
        
        for (int i = 0; i< charArray.length; i++){
            if (Character.isUpperCase(name.charAt(i))){
                System.out.print(name.charAt(i));
            }
        }
    }
}
