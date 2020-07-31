package Lesson10InstanceMethods;

public class Ex7 {

    private String name;
    private int age;
    static int counter = 0;



    public static void main(String[] args) {
        Ex7 ex1 = new Ex7("Jora", 13);
        Ex7 ex2 = new Ex7("Jora", 13);
        Ex7 ex3 = new Ex7("Jora", 13);
        Ex7 ex4= new Ex7("Jora", 13);
        Ex7 ex5 = new Ex7("Jora", 13);
        Ex7 ex6 = new Ex7("Jora", 13);
        Ex7 ex7 = new Ex7("Jora", 13);
        Ex7.getNumberOfCats();

    }



    public Ex7(String name, int age){
        this.counter ++;
        this.name = name;
        this.age = age;
        if (counter > 5){
            System.out.println("too many cats");

        }
    }

    public static int getNumberOfCats(){
        return counter;
    }
}
