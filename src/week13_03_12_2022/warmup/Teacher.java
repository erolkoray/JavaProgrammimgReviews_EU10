package week13_03_12_2022.warmup;

import java.time.LocalDate;

public class Teacher {

    public String name, lastName;
    public char gender;
    public LocalDate dateOfBirth;
    public int age;
    public long ID;


    public Teacher(String name, String lastName, char gender, LocalDate dateOfBirth, long ID) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.age = calculateAge();
        this.ID = ID;
    }


    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                ", ID=" + ID +
                '}';
    }

    public int calculateAge(){
        int currentYear = LocalDate.now().getYear();
        int yearOfDateBirth = dateOfBirth.getYear();
        return currentYear - yearOfDateBirth;

    }

}
/*
Task 1 :



     1. create a class named Teacher that has the followings features:
            Attributes:
                name,lastName, gender, dateOfBirth(use LocalDate), age, id

            Methods:

                sets all the attributes of the teacher object
                toString(): returns the full info of teacher Object

 */