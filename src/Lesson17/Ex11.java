package Lesson17;

import sun.jvm.hotspot.jdi.SACoreAttachingConnector;

import java.time.LocalTime;
import java.util.*;

public class Ex11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int storeNumber  = scanner.nextInt();

        String[] stores = new String[storeNumber];

        for (int i = 0; i < storeNumber; i++) {
            Scanner scanner1 = new Scanner(System.in);
            stores[i] = Arrays.toString(scanner1.nextLine().split(" "));
        }

        System.out.println(Arrays.toString(stores));

    }
}
