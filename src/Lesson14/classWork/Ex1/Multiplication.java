package Lesson14.classWork.Ex1;

public class Multiplication extends IntBinaryOperations {


    public Multiplication(int firstArg, int secondArg) {
        super(firstArg, secondArg);
    }

    @Override
    public int perform() {
        return firstArg * secondArg;
    }
}
