package Lesson14.classWork.Ex1;

abstract class IntBinaryOperations {
    protected int firstArg;
    protected int secondArg;

    public IntBinaryOperations(int firstArg, int secondArg) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }

    public abstract int perform();
}
