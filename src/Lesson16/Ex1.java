package Lesson16;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Mr.Green, Mr.Yellow, Mr.Red"));

        arrayList.forEach(System.out::println);

       /* for (String name: arrayList) {
            System.out.println(name);
        }*/
    }
}
