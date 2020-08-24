package Lesson15.Ex3;

public class Main {

    public static void main(String[] args) {
        Func<Long, Long> squre = new Func<Long, Long>() {
            @Override
            public Long apply(Long val) {
                return val * val;
            }
        };

        long val = squre.apply(21L);
    }

}


@FunctionalInterface
interface Func<T,R>{
    R apply(T val);

    static void asas(){

    }

}
