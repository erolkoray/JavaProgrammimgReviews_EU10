package week15_17_12_2022.method_overriding.task3;

public class Manager extends Employee{

    @Override
    public int salary() {
        return super.salary()+20000;
    }
}
