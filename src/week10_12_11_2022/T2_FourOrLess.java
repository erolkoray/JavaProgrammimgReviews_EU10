package week10_12_11_2022;

import java.util.Arrays;

public class T2_FourOrLess {
    /*
    Task 2 : Four or less
					Given an Array of Strings, go through and read only Strings that are 4 characters or less.
					Take those Strings and put them into a different Array
					Ex:
					Input:
					"apples", "tree", "loop, "cat", "animal", "shortcut"
					Output:
					[ tree, loop, cat ]
     */
    public static void main(String[] args) {

        String[] words = {"apples", "tree", "loop", "cat", "animal", "shortcut" };

        String[] result = fourOrLess(words);
        System.out.println(Arrays.toString(result)); // tree, loop, cat

    }

    public static String[] fourOrLess(String[] words) {
        int number = findTheNumberOfWordLessThanFour(words);
        /*
         int counter = 0;
        for (String word : words) {
            if (word.length() <= 4)
                counter++;
        }
        //return counter;

         */
        String[] array = new String[number]; // this creates a new Array with 3 element spaces - Array size cannot be changed
        int i = 0;
        for (String word : words) {

            if (word.length() <= 4) // if a word is 4 or less characters, it will add it to the new String Array
                array[i++] = word; // i=0 will be the first word with 4 or less charactered word
            // - i=0 = tree,
            // - i=1 = loop,
            // - i=2 = cat,    ---> 3rd and final element.
        }

        return array;
    }

    public static int findTheNumberOfWordLessThanFour(String[] words) {
        int counter = 0;
        for (String word : words) {
            if (word.length() <= 4)
                counter++;
        }
        return counter; // returns 3
    }
}