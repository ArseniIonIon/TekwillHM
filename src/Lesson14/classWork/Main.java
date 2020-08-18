package Lesson14.classWork;

public class Main {

    public static void main(String[] args) {
        Child1 child1 = new Child1();
        child1.message();
        Child2 child2 = new Child2();
        child2.message();
        Parent child = new Child1();
        child.message();
    }
}
