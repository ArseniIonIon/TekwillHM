package Lesson15.ClassWork;

import java.util.function.LongUnaryOperator;

public class Main {

    public static LongUnaryOperator unaryOperator = (long a) -> {

        long b = a +1;
        if ( b%2  == 0){
            return b;
        }else{
            b++;
        }
    return  b;};
}
