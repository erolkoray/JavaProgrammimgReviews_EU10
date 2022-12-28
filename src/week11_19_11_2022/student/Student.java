package week11_19_11_2022.student;

import java.time.LocalDate;

public class Student {
     /*
1. create a class named Student that has the followings features:
			Attributes:
				name, gender, dateOfBirth, age, studentID, grade
			Methods:
				sets all the attributes of the student object
				toString(): returns the full info of student Object
 */

    public String name;
    public char gender, grade;
    public LocalDate dateOfBirth;
    public int age, studentID;

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", grade=" + grade +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                ", studentID=" + studentID +
                '}';
    }

    public Student(String name, char gender, char grade, LocalDate dateOfBirth, int studentID) {
        this.name = name;
        this.gender = gender;
        this.grade = grade;
        this.dateOfBirth = dateOfBirth;
        this.age = LocalDate.now().getYear()-dateOfBirth.getYear();
        this.studentID = studentID;


    }
}
