package Lesson14.classWork.Shapes;

public class Cube {

    double legth;

    public Cube(double legth) {
        this.legth = legth;
    }

    public double getA() {
        return legth;
    }

    public double getArea(){
        return  6 * legth * legth ;
    }

    public  double getVolume(){
        return Math.pow(legth,3);
    }
}
