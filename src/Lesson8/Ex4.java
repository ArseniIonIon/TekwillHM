package Lesson8;

import javafx.scene.transform.Scale;
import jdk.nashorn.internal.runtime.ScriptRuntime;
import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String sc = scanner.nextLine();

        StringBuilder res = new StringBuilder(String.valueOf(sc.charAt(0)));
        int counter = 1;
        for (int i = 1; i < sc.length(); i++) {

            if (sc.charAt(i-1) == sc.charAt(i)) {
                counter++;
            } else {
                res.append(counter).append(sc.charAt(i));
                counter = 1;
            }
        }
        res.append(counter);
        System.out.printf("Result: %s",res);
    }
}
