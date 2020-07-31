package Lesson10;

public class Ex1class {

    public static void main(String[] args) {
        System.out.println("Hello Word");
    }

    public static int[] getFirstAndLast(int a []){

        return  new int[] {a[0], a[a.length-1]};
    }
}
