package Lesson18.Ex2;

public class Converter {

    public static double convertStringtoDouble(String input){
        try {
            return Double.parseDouble(input);
        }catch (IllegalArgumentException e){
            return 0;
        }
    }



    public static void main(String[] args) {
        System.out.println(convertStringtoDouble("15.5"));
    }
}
