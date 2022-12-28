package week12_26_11_2022.student;

import java.util.Scanner;

public class StudentObject {

    public static void main(String[] args) {

        String name = "Koray";


        Student student1 = new Student(name);
        System.out.println(student1);

        Scanner scan = new Scanner(System.in);
        System.out.println("Please input "+name+"'s age");
        int age = scan.nextInt();

        student1.age = age;

        System.out.println("Please input "+name+"'s batch number");

        int batch = scan.nextInt();
        student1.batchNumber = batch;

        System.out.println(student1);


        /*

        student1.age = 12;
        student1.batchNumber = 34;

        System.out.println(student1);

        student1.name = "Erol"; // this is how you can update the each element in this constructor

        System.out.println(student1);

         */

    }
}
