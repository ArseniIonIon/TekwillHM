package Lesson11.HomeWork;

public class Ex1 {

    public static void main(String[] args) {
        System.out.println(toPrimitive(true));
    }


    public static boolean toPrimitive(Boolean b){
        boolean var;
        if (b != null){
            var = b;
            return var;
        }
        else{
        return false;
        }
    }
}
