package Lesson16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<Integer> set  = new TreeSet<>();

        set.add(2);
        set.add(0);
        set.add(1);
        set.add(7);

        System.out.println(set);

        Iterator<Integer> integerIterator = set.iterator();
        while (integerIterator.hasNext()){
            Integer current  = integerIterator.next();
            if (current< 10){
                integerIterator.remove();
            }
        }

    }
}
