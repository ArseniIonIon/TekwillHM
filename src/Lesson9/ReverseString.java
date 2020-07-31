package Lesson9;

public class ReverseString {

    public static void main(String[] args) {
        String s = "asd";


        System.out.printf(reverse(s));

    }


    public static String reverse(String s){
        if (s.isEmpty()){
            return s;
        }

        return reverse(s.substring(1)) + s.charAt(0);
}
}
