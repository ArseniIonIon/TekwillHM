package Lesson15.Ex1;

public class Main {

    public static void main(String[] args) {
        ComplexNumber complexNumber = new ComplexNumber(1,1);
        ComplexNumber complexNumber1 = new ComplexNumber(1, 1);

        System.out.println(complexNumber.equals(complexNumber1));

        System.out.println(complexNumber1.hashCode()  + "\n" + complexNumber.hashCode());

    }
}
