package Lesson14.classWork.Shapes;

public class Square {
    public  double lenght;

    public Square(double lenght) {
        this.lenght = lenght;
    }

    public double getLenght() {
        return lenght;
    }

    public double getArea(){
        return  lenght* lenght;
    }

    public double getPerimeter(){
        return lenght *4;
    }
}
