package week06_15_10_2022;

public class T5_RemoveSpecificIndex {

    public static void main(String[] args) {

        String word = "Adamm";
        int index = 3;

        String temp = "";

        if (index > word.length() || index < 0) {
            System.out.println("This is not a valid index");
        } else {

            for (int i = 0; i < word.length(); i++) {
                if (i == index) // if my 'i' matches the 'index', skip that 'i' and move to the next one
                    continue;
                temp += word.charAt(i); // a d a - m
            }
            System.out.println(temp); //adam
        }
    }
}
/*
Task 5: Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).

input:
 String word="Adamm";
 int index=3;

 output:
 Adam
 */