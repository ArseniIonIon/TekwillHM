package Lesson14.classWork.Ex1;

public class Addition extends IntBinaryOperation{

    public Addition(int firstArg, int secondArg) {
        super(firstArg, secondArg);
    }

    @Override
    public int perform() {
        return firstArg + secondArg;
    }
}
