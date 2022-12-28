package week08_29_10_2022;

public class T2_MultipleWords {

    public static void main(String[] args) {


        String str =  "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";

        String[] words = str.split(", ");

        System.out.println("Given words are: " + str);

        for (String eachWord : words) {

            if(eachWord.contains(" ")) {
                System.out.println(eachWord);
            }

        }




    }
}
/*
Task 2 :    Write a program that accepts string and prints multiple words in the string

        "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer”

        output : wooden spoons
                 trash can
                  dish washer

 */
