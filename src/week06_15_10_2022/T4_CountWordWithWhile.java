package week06_15_10_2022;

public class T4_CountWordWithWhile {

    public static void main(String[] args) {

        String str="Java is java in everywhere is Java";
        String word="Java";
        str = str.toLowerCase();
        word = word.toLowerCase();

        int wordCounter = 0;
        while(str.contains(word) || str.contains(word.toLowerCase())){
            wordCounter++;
            str =str.replaceFirst(word,"");

        }
        System.out.println(wordCounter);
    }
}
/*
Task 4: Given a sentence which is string find word how many times repeats in it.

Hint: use replaceFirst() with while loop

input:
*                                String str="Java is java in everywhere is Java";
*                                String word="Java";
output:3
 */
