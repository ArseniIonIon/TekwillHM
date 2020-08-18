package Lesson14.classWork.Shapes;

public class Triangle {

    double a,b,c;

    public Triangle(double a,double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getArea(){
        double  p = (a+b+c)/2;
        return  Math.sqrt(p* (p - a) * (p - b) * (p - c));
    }

    public double getPerimeter(){
        return a+b+c;
    }
}
