package Lesson14.classWork.Shapes;

public class Circle {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return  Math.PI * Math.pow(radius,2);
    }

    public  double getPerimeter(){
        return Math.PI * 2 * radius;

    }
}
