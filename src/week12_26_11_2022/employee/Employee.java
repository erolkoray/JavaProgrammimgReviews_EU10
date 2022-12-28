package week12_26_11_2022.employee;

public class Employee {

    public String name;
    public int ID;
    public char gender;

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", gender=" + gender +
                '}';
    }



    public Employee(String name){
        this.name = name;
    }

    public Employee(String name, int ID){
        this.name = name;
        this.ID = ID;
    }

    public Employee(String name, int ID, char gender) {
        this.name = name;
        this.ID = ID;
        this.gender = gender;
    }



}
