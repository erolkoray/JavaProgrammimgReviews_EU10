package week13_03_12_2022.warmup;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class School {

    static ArrayList<Teacher> teachers = new ArrayList<>();

    static {
        Teacher teacher1 = new Teacher("Muhtar", "abc", 'M', LocalDate.of(1987, 1, 1), 1L);
        Teacher teacher2 = new Teacher("Koray", "abc", 'M', LocalDate.of(1981, 1, 1), 13L);
        Teacher teacher3 = new Teacher("Aysun", "abc", 'F', LocalDate.of(1993, 1, 1), 50L);
        Teacher teacher4 = new Teacher("Asya", "abc", 'F', LocalDate.of(1990, 1, 1), 19L);
        Teacher teacher5 = new Teacher("Saim", "abc", 'M', LocalDate.of(1997, 1, 1), 34L);
        Teacher teacher6 = new Teacher("Mike", "abc", 'M', LocalDate.of(1989, 1, 1), 6L);


        teachers.addAll(Arrays.asList(teacher1,teacher2,teacher3,teacher4,teacher5,teacher6));


    }


    public static void main(String[] args) {

        System.out.println("all teachers: "+teachers);

        System.out.println("---------------------------------------------");

        ArrayList<Teacher> result = getTeachersNameStartsWith("M");
        System.out.println("Teachers that starts with M: "+result);

        System.out.println("---------------------------------------------");

        ArrayList<Teacher> femaleTeachers = getTeachersByGender('F');
        System.out.println("Female teachers only: "+femaleTeachers);
    }

    private static ArrayList<Teacher> getTeachersByGender(char gender) {
        ArrayList<Teacher> result = new ArrayList<>();

        for (Teacher eachTeacher : teachers) {
            if(eachTeacher.gender == gender){
                result.add(eachTeacher);
            }
        }
            return result;
    }

    private static ArrayList<Teacher> getTeachersNameStartsWith(String prefix) {

        ArrayList<Teacher> result = new ArrayList<>();

        for (Teacher eachTeacher : teachers) {
            if(eachTeacher.name.startsWith(prefix))
            result.add(eachTeacher);
        }

        return result;
    }


}
/*
 2. create a class which is School with main method

    3. create a list of teacher in School class inside the STATIC BLOCK

    4. create a method in School class which is returning the list of teachers if the last name start with "M"

    5. create a method in School class then you will find the female teachers

    6. create a method in School class then find the teachers age smaller than 30

    7. create a methot in School class then find the teachers born in 1967 year

 */