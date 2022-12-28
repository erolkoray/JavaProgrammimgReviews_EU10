package week05_08_10_2022;

public class StringIntro {

    public static void main(String[] args) {
        // we can create String two different ways - String literal & New Keyword

        // STRING LITERAL

        String str = "literal";
        String str1 = "literal";

        System.out.println(str==str1); // true

        // STRING NEW KEYWORD

        String str2 = new String("literal");
        System.out.println(str == str2); // false

    }
}
