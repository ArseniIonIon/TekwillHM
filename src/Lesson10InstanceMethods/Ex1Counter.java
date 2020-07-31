package Lesson10InstanceMethods;

public class Ex1Counter {

   private static int counter;

    static int  inc(){
         return  counter++;
    }
    public static int  getCounter(){
         return counter;
    }
}
