package Lesson14.classWork.Ex5;

public class RunableImp implements Runnable {

    private String text;
    private  int repeat;

    public RunableImp(String text, int repeat) {
        this.text = text;
        this.repeat = repeat;
    }

    @Override
    public void run() {
        for (int i = 0; i < repeat ; i++) {
            System.out.println(text);

        }
    }
}
