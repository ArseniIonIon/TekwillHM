package Lesson10;


public class Ex2 {

    public static void main(String[] args) {
        String sc = getString();
        System.out.println(sc);
    }

    public static String getString(){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        return scanner.nextLine();
    }
}
