package Lesson12.Ex4;

public class Main {

    public static void main(String[] args) {

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4,2);
        Shape triangle = new Triangle(2,4);
        Shape square = new Square(3);

        System.out.println(circle.area());
        System.out.println(rectangle.area());
        System.out.println(triangle.area());
        System.out.println(square.area());
    }
}
