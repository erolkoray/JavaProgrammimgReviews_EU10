package week05_08_10_2022;

import java.util.Scanner;

public class WithoutFirstAndLast {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();
        String result = "";
        if(word.length() <= 2) {
            result = word;
        }else {
            result = word.substring(1,word.length()-1);
        }
        scan.close();
        System.out.println(result);
    }
}
/*
Task 3: Given a string, return a version without the first and last char, so "Hello" yields "ell".
      Hint: The string length will be at least 2.

 */