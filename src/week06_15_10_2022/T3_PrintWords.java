package week06_15_10_2022;

public class T3_PrintWords {

    public static void main(String[] args) {

        String str="Java is java in everywhere is Java";
        String temp = "";


        for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i)!=' ') {        // if 'i' is not space that character will be added to empty String (temp)
                    temp += str.charAt(i);
                }
            if(str.charAt(i)==' ') { // if 'i' is equal to space, temp will get printed out and 'temp' will reset to an empty String
                System.out.println(temp); // this will not print out the final word in the sentence, because there is not a space after the final word in any sentence.
                temp="";
            }
        }

        System.out.println(temp);// once the for loop has finished, it will print out the final word


    }
}
/*
Task 3: Given a sentence which is string and print the each word.
input:
String str="Java is java in everywhere is Java";
output:
Java
is
java
in
.
.
.
 */