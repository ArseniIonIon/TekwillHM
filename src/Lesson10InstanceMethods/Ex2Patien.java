package Lesson10InstanceMethods;

public class Ex2Patien {

    private static String patient;

    public  static void call(){
        say();
    }

    public static void say(){
        System.out.println("Hello, my name is" + patient + " I need a doctor.");
    }
}
