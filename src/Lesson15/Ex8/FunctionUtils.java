package Lesson15.Ex8;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class FunctionUtils {

    public static Supplier<Integer> getInfiniteRange(){

        Supplier<Integer> supplier = new Supplier<Integer>() {

            private int i;
            @Override
            public Integer get() {
                return i++;
            }
        };
        return supplier;
    }
}
