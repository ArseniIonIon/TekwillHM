package Lesson15.ClassWork;

public interface Func {

    @FunctionalInterface
    interface Funct<T,R> {
        R apply(T val);

        static void doNothing(){

        }

        default void doNothingByDefault(){

        }

    }
}
