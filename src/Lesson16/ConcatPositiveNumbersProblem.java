package Lesson16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ConcatPositiveNumbersProblem {

    public static ArrayList<Integer> concatPositiveNumber(ArrayList<Integer> l1, ArrayList<Integer> l2){
        ArrayList<Integer> array = new ArrayList<>();

        for (int integer: l1) {
            if ( integer >= 0) {
                array.add(integer);
            }
        }
        for (int i = 0; i < l2.size(); i++) {
            if (l2.get(i) >= 0){
                array.add(l2.get(i));
            }
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list1 = readArrayList(scanner);
        ArrayList<Integer> list2 = readArrayList(scanner);
        ArrayList<Integer> result = concatPositiveNumber(list1,
                list2);
        result.forEach(n -> System.out.print(n + " "));
    }
    private static ArrayList<Integer> readArrayList(Scanner scanner)
    {
        return Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}

