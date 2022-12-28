package week05_08_10_2022;

import java.util.Scanner;

public class RedOrBlue {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();
        /*
        String word1 = "redxx",
                word2 = "xxred",
                word3 = "blueTimes";

         */
        if(word.startsWith("red")){
            System.out.println("red");
        } else if (word.startsWith("blue")){
            System.out.println("blue");
        } else {
            System.out.println(" ");
        }

        scan.close();



    }
}
/*
 Task 4: Given a string, if the string begins with "red" or "blue" print that color string, otherwise print the empty string.

     *                 input :"redxx" → "red"
     *                 input :"xxred" → ""
     *                 input :"blueTimes" → "blue"

 */