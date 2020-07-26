package Lesson11;

public class User {
    String login;
    String firstName;
    String lastName;


    public  User(String login, String firstName, String lastName){
        this.firstName= firstName;
        this.lastName = lastName;
        this.login = login;
    }

    public static void main(String[] args) {
        User user = new User("L","Arseni", "Ion");

        System.out.println(user.login + "\n" + user.lastName + "\n" + user.firstName);
    }
}
