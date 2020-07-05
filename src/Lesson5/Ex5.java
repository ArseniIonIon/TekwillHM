package Lesson5;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        final double PI = 3.14;
        double floorSpace;
        double a,b,c;
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Input Room Type:");
        String roomType = scanner.nextLine();

        switch (roomType){
            case "triangular":
                System.out.println("Input the sides of the triangle: ");
                a = scanner.nextDouble();
                b =  scanner.nextDouble();
                c = scanner.nextDouble();
                double s = (a + b + c)/2.0d;
                double x = (s * (s-a) * (s-b) * (s-c));
                floorSpace = Math.sqrt(x);
                System.out.println(floorSpace);
                break;
            case "rectangular":
                System.out.println("Input the sides of rectangle ");
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                floorSpace = a*b;
                System.out.println(floorSpace);
                break;
            case "round":
                System.out.println("Input radius of circle");
                a = scanner.nextDouble();
                floorSpace  =  PI * Math.pow(a,2);
                System.out.println(floorSpace);
                break;
            default:
                System.out.println("Invalid roomType");
        }
    }
}
