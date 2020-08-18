package Lesson12.Ex3;

public class Employee {
    protected String name;
    protected String email;
    protected int experience;

    public Employee(String name, String email, int experience){
        this.email = email;
        this.experience = experience;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getExperience() {
        return experience;
    }
}
