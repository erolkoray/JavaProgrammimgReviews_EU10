package week05_08_10_2022;

public class StringMethods {

    public static void main(String[] args) {

        //SUBSTRING METHOD

        String subs = "Cydeo";
        // only get the "yde" form the word above
         System.out.println(subs.substring(1,4));
         // only get the "Cy" from the subs (word above)
        System.out.println(subs.substring(0,2));
        // get the "deo" from subs variable
        System.out.println(subs.substring(2));
        // only get the "ydeo"
        System.out.println(subs.substring(1));

        System.out.println("---------------------------------------------------------");

        //CHARAT(); METHOD

        String str = "Koray";
        System.out.println(str.charAt(3)); // 4th character
        System.out.println(str.charAt(4)); // 5th character

        System.out.println("---------------------------------------------------------");

        // if we want to get the length of String length()
        System.out.println(str.length());

        // how to get the last character
        int lengthOfString = str.length();
        int indexOfLastChar = lengthOfString-1;
        System.out.println(str.charAt(indexOfLastChar)); //charAt() used here to convert the index number to letter

        System.out.println("---------------------------------------------------------");

        // EQUALS() & EQUALSIGNORECASE() METHODS

        String str6="WorD";
        String str7="word";

        System.out.println(str6.equals(str7)); // false - this compares the words as it is and checking for exact match
        System.out.println(str6.equalsIgnoreCase(str7)); // true - because this ignores the Upper & Lower cases

        System.out.println("---------------------------------------------------------");

        //TOLOWERCASE() TOUPPERCASE() METHODS
        String str8 = "KorayERol";
        System.out.println(str.toLowerCase()); //to make str lower case - korayerol
        System.out.println(str.toUpperCase()); //to make str upper case - KORAYEROL

        System.out.println("---------------------------------------------------------");

        // TRIM() METHOD - THIS IS TO REMOVE ALL WHITE UNUSED SPACES

        String str4 = "       BADman    ";
        System.out.println(str4.trim()); // will return BADman
        System.out.println(str4.toLowerCase().trim()); // will return badman
        System.out.println(str4.toUpperCase().trim()); // will return BADMAN

        System.out.println("---------------------------------------------------------");

        // INDEXOF() METHOD

        String number = "0123456";
        System.out.println(number.indexOf('3')); // this will return 3
        System.out.println(number.indexOf("34")); // this will return the first characters index
        System.out.println(number.indexOf("14")); // it will return -1 because there is no 14 sequence in the Number
        System.out.println(number.indexOf("36")); // same as above, it will return -1 for same reason

        String sentence = "Java is a programming language";
        System.out.println(sentence.indexOf(" programming ")); // 9 - because the first index is just a space before "P"

        System.out.println("---------------------------------------------------------");

        // LASTINDEXOF() METHOD

        // THIS IS SAME AS INDEX OF BUT COMPILER WILL READ THE DATA FROM RIGHT TO LEFT

        String sentence1 = "Java is Java";
        System.out.println(sentence1.lastIndexOf("Java"));
        //vs
        System.out.println(sentence1.indexOf("Java"));

        System.out.println("---------------------------------------------------------");

        // REPLACE() & REPLACEFIRST() METHODS

        String sentence3 = "Java is a hard programming language";
        System.out.println(sentence3.replace("hard", "easy"));
        System.out.println(sentence3.replace("hard", "fun"));

        String sentence4 = "java is not same with java";
        System.out.println(sentence4.replaceFirst("java", "c#"));

        System.out.println("---------------------------------------------------------");


        // REPEAT() METHOD

        String str3 = "Koray ";
        System.out.println(str3.repeat(4)); //repeats in the same line even if you use println

        System.out.println("-------------------------------------------------------");

        // ISEMPTY() METHOD

        String emptyWord = " ";
        System.out.println(emptyWord.isEmpty()); // false because there is space and that counts as a character in java

        System.out.println("---------------------------------------------------------");


        // ISBLANK() METHOD

        String blankWord = "    ";
        System.out.println(blankWord.isBlank()); // true - because it is just spaces, spaces are not occupied with things

        System.out.println("---------------------------------------------------------");

        //STARTSWITH() & ENDSWITH() METHODS

        // startsWith() and endsWith() methods are used to check the String if its starting and/or ending with given char sequence or not

        String sentence5 = "Java is a great language";

        System.out.println(sentence5.startsWith("Java")); // true
        System.out.println(sentence5.endsWith("language")); // true

        System.out.println("---------------------------------------------------------");

        // CONTAINS() METHOD - used to check if the given char sequence is in the String or not

        String sentence6 = "Java is Java";
        System.out.println(sentence6.contains("Java")); // true




    }
}
