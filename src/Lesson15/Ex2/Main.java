package Lesson15.Ex2;

public class Main {
    public static void main(String[] args) {

        Box<Pie> pieBox = new Box<>();
        pieBox.putT(new Pie("Pie Box"));
        System.out.println(pieBox.getT().name);
    }
}
