package Lesson10InstanceMethods;

public class Ex5FullName {

    private String firstName;
    private String lastName;
    public Ex5FullName() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String name){
        if (name != null){
            this.firstName = name;
        }else {
            this.firstName = "";
        }

    }

    public void setLastName(String name){
        if (name!=null){
            this.lastName = name;
        }else {
            this.lastName = "";
        }

    }

    public String getFullName(){
        if (firstName.isEmpty() && lastName.isEmpty()){
            return "Unknown";
        }
        return this.firstName +"  "+ this.lastName;
    }


    public static void main(String[] args) {
        Ex5FullName ex = new Ex5FullName();
        ex.setFirstName("");
        ex.setLastName("");

        System.out.println(ex.getFullName());
    }
}
