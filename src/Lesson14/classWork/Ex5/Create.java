package Lesson14.classWork.Ex5;

public class Create{

    public static Runnable createRunnable(String text, int repeat){
        return new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < repeat; i++) {
                    System.out.println(text);
                }
            }
        };
    }
}
