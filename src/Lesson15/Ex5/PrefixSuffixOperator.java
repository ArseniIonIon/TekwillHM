package Lesson15.Ex5;

import java.util.function.UnaryOperator;

public class PrefixSuffixOperator {

    public static final String PREFIX = "__pref__";
    public static final String SUFFIX = "__suff__";
    public static UnaryOperator<String> operator = (x) -> PREFIX + x.trim() + SUFFIX;


    public static void main(String[] args) {
        System.out.println(PrefixSuffixOperator.operator.apply("Alex"));
    }
}

