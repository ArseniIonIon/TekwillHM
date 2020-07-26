package Lesson11;

public class EmployeeEx8 {

    String name ;
    int salary ;
    String address;

     EmployeeEx8() {
        this("unknown","unknownk",0);
    }

    /*EmployeeEx8(String name, int salary) {
        this(name, salary, "unknown");
    }
*/

     EmployeeEx8(String name, String address, int salary){
        this.name = name;
        this.address = address;
        this.salary = salary;
    }




}
