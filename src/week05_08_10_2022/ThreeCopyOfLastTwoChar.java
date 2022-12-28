package week05_08_10_2022;

import java.util.Scanner;

public class ThreeCopyOfLastTwoChar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word with more than two chars");
        // String wordFromScanner = "Hello"
        String wordFromScanner = scan.nextLine();
        int indexOfLastChar = wordFromScanner.length() -1;
        int indexOfSecondFromLastChar= wordFromScanner.length() -2;
        char lastChar = wordFromScanner.charAt(indexOfLastChar),
                beforeLast  = wordFromScanner.charAt(indexOfSecondFromLastChar);

        String result = ""+beforeLast+lastChar;
        for (int i = 0; i < 3; i++) {
            System.out.print(result);

            scan.close();
        }




    }
}
/*
Task 2: Create a logic print a new string made of 3 copies of the last 2 chars of the original string.

      Hint: The string length will be at least 2.

      input: Hello
      output: lololo
 */