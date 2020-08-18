package Lesson14.classWork.Shapes;

public class Tetrahedron {

    double lenght;

    public Tetrahedron(double lenght) {
        this.lenght = lenght;
    }

    public double getLenght() {
        return lenght;
    }

    public double getArea(){
        return  4 * Math.sqrt(3) * Math.pow(lenght,2);
    }

    public double getVolume(){
       return Math.pow(lenght,3)/ (6*Math.sqrt(2)) ;
    }
}
