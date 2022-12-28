package week09_05_11_2022;

import java.util.Scanner;

public class T4_OurTrim {

    public static void main(String[] args) {
/*
Task 4 :    Write a method that can remove  all extra space from String , trim() is forbidden

// create a loop --- taking every index one by one with charAt(i)  and compares against ' '   str.charAt(i) == ' '
don't add empty to result, if not empty add it to result string

                 Input: "  Hello "
                 Output: Hello
 */

        Scanner scan = new Scanner(System.in);

        String result = isTrimmed(scan.nextLine()); //     hello     .
        System.out.println(result);

    }
    public static String isTrimmed(String str) {
        String dummy = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch==' '){
                continue;
            }
            dummy+=ch;
        }

        return dummy;
    }
}
