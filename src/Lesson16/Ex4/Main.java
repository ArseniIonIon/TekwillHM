package Lesson16.Ex4;

import java.util.*;
import java.util.stream.Collectors;

public class Main {


        public static Collection<Integer> pow2(Collection<Integer>
                                                       numbers) {

            Collection<Integer> collection = new ArrayList<>();

            Iterator<Integer> integerIterator = numbers.iterator();

            while (integerIterator.hasNext()){
                int number = integerIterator.next();
                number *= number;
                ((ArrayList<Integer>) collection).add(number);
            }
            return collection;
        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Collection<Integer> numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        Collection<Integer> result =
                pow2(numbers);
        System.out.println(result.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" ")));
    }

    }

