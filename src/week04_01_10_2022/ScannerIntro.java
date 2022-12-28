package week04_01_10_2022;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter one Integer number");
        int intValue = scan.nextInt();

        System.out.println("intValue = " + intValue);



        System.out.println("Please enter one Double number");
        double doubleValue = scan.nextDouble();
        System.out.println("doubleValue = " + doubleValue);


        scan.nextLine(); // in order to eliminate the Enter from the compilers memory
        System.err.println("give me the sentence");
        String sentence = scan.nextLine();
        System.out.println("sentence = " + sentence);


        scan.close();
    }

}
