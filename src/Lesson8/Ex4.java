package Lesson8;

import javafx.scene.transform.Scale;
import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String dna = scanner.nextLine();


        int counter = 0;
        for (int i = 0; i<dna.length();i++){

            if (dna.charAt(i) == dna.charAt(i+1)){
                counter++;
                continue;

        }
        System.out.println(counter);
    }
}}
