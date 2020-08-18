package Lesson12.Ex3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        DataAnalyst dataAnalyst = new DataAnalyst("Valera","valera@gmail.com",3,true, new String[]{"neural network", "decision trhree"});
        Developer developer = new Developer("Ion","aa@gmail.com",4, new String[]{"PHP, java, sql, django"}, "phyton");

        System.out.println(Arrays.toString(dataAnalyst.getMethods()));


    }
}
