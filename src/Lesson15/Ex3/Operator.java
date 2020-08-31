package Lesson15.Ex3;


import java.util.function.IntBinaryOperator;
public class Operator {

    public static IntBinaryOperator intBinaryOperation = (x,y) -> x > y ? x : y;
}
