package week05_08_10_2022;

import java.util.Scanner;

public class GetFirst2UpperCase {

    public static void main(String[] args) {

        /*
        Task 1: Given a string, print the string made of its first two chars, so the String Hello yields "HE"
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
       // String sentence = "Hello";
        String sentence = scan.next();
        String result = ""+sentence.charAt(0)+sentence.charAt(1);
      //  result = result.toUpperCase(); - this can be also done but below is shorter

        System.out.println(result.toUpperCase());
    }
}
