package week06_15_10_2022;

public class T1_CountSpecificWord {

    public static void main(String[] args) {

        String str="Java is java in everywhere is Java";
        String word="Java";

        int counter = 0;
        for (int i = 0; i <= str.length()-word.length(); i++) {
            String each = str.substring(i,i+word.length());
            if(each.equalsIgnoreCase(word))
                counter++;
        }

        System.out.println(counter);

    }
}
/*
        Task 1: Given a sentence which is string find word how many times repeats in it.
Hint: use substring with for loop
input:
*                                String str="Java is java in everywhere is Java";
*                                String word="Java";
output:3
         */

// Java is Java
//01234