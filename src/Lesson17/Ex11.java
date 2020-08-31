package Lesson17;

import sun.jvm.hotspot.jdi.SACoreAttachingConnector;

import java.time.LocalTime;
import java.util.*;

public class Ex11 {

    public static void main(String[] args) {

        LocalTime offTime = LocalTime.of(20,0);

        Scanner scanner = new Scanner(System.in);
        int storeNumber  = scanner.nextInt();

        List<String> stores = new ArrayList<>();

        for (int i = 0; i < storeNumber; i++) {
            String token = scanner.nextLine();

            String[] arr = token.split(" ");

            LocalTime time = LocalTime.parse(arr[1].trim());
           if (time.isAfter(offTime)){
               stores.add(arr[0]);
           }
        }

        for (String store: stores) {
            System.out.println(store);
        }
    }
}
