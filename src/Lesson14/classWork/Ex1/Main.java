package Lesson14.classWork.Ex1;

public class Main {

    public static void main(String[] args) {

        Multiplication multiplication = new Multiplication(3,4);
        Addition addition = new Addition(2,6);

        System.out.println(multiplication.perform());
        System.out.println(addition.perform());
    }
}
