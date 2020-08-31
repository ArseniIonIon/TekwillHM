package Lesson15.ClassWork;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.LongUnaryOperator;

public class Main {


    public static void main(String[] args) {
        Func.Funct<Long,Long> square = new Func.Funct<Long, Long>() {
            @Override
            public Long apply(Long val) {
                return val*val;
            }
        };

        long val = square.apply(3L);


        Func.Funct<Long, Long> addition = val1 -> val*val;

        BiFunction<Integer, Integer, Integer> big = (x,y) -> x+y;
        System.out.println(        big.apply(5,3));

        Function<Integer,Integer> f = (x) -> x +1;

        acceptFunctionalInterface((x)-> x+1 );


    }

    public static void acceptFunctionalInterface(Function<Integer,
            Integer> f) {
        System.out.println(f.apply(10));
    }

    public static LongUnaryOperator unaryOperator = (long a) -> {

        long b = a +1;
        if ( b%2  == 0){
            return b;
        }else{
            b++;
        }
    return  b;};
}
