package Lesson14.classWork.Shapes;

public class Sphere {

    double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
       return Math.PI * Math.pow(radius,2) * 4.0;
    }

    public  double getVolume(){
        return (4.0/3.0)*Math.PI * Math.pow(radius,3);
    }
}
