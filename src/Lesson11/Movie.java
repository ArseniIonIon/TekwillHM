package Lesson11;

public class Movie {

    private String title;
    private String desc;
    private int year;


    public Movie (String title, String desc, int year){
        this.desc = desc;
        this.title = title;
        this.year = year;
    }

    public Movie (String title, int year){
        this.desc = "empty";
        this.title = title;
        this.year = year;
    }

}
