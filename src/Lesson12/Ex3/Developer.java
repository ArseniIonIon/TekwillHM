package Lesson12.Ex3;

public class Developer extends Employee {

    protected String[] skills;
    protected String mainLanguage;

    public Developer(String name, String email, int experience, String[] skills, String mainLanguage) {
        super(name, email, experience);
        this.mainLanguage = mainLanguage;
        this.skills = skills;
    }

    public String[] getSkills() {
        return skills;
    }

    public String getMainLanguage() {
        return mainLanguage;
    }


}
