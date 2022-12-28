package week06_15_10_2022;

public class T2_CountWords {

    public static void main(String[] args) {

        String str="Java is java in everywhere is Java"; // if we count the spaces and adding +1 we can get the words
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i)==' ') // we need to assign the space as if its a character so everytime there is a space the word counter goes up by 1.
                counter++;

        }
        System.out.println(counter+1); // when printing we need to add +1 because there is always 1 word more than there is spaces in a sentence

    }
}
