package week16_24_12_2022.final_keyword.final_with_variable;

public class Person {

    private String name;

    final public String birthDay;

    public Person(String birthDay, String name) {
        this.birthDay = birthDay;
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
