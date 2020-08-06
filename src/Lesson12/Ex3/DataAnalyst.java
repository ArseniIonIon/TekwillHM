package Lesson12.Ex3;

public class DataAnalyst extends Employee {

    protected  String[] methods;
    protected  boolean phd;

    public DataAnalyst(String name, String email, int experience,boolean phd, String[]methods) {
        super(name, email, experience);
        this.methods = methods;
        this.phd = phd;
    }

    public String[] getMethods() {
        return methods;
    }

    public boolean isPhd() {
        return phd;
    }
}
