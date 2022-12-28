package week10_12_11_2022;

import java.util.Arrays;

public class T4_HidePasswords {

    /*
    Task 4 : Hide Passwords
			        Given an array of passwords (String). Hide each password as a star (*) and show the hidden password
					Ex:
					Input:
					{"one", "hi", "hold}
					Output:
					[ ***, **, **** ]
     */

    public static void main(String[] args) {

        String [] arr={"one", "hi", "hold"};

        String [] result=  hidePassword(arr); // this is assigning hidePassword(arr) method to the String array result

        System.out.println(Arrays.toString(result));

    }

    public static String[] hidePassword(String[] arr) {

        String [] resultsOfHiddenPasswords=new String[arr.length];
        int index=0;
        //I need to get each element
        for (String element : arr) {
            //one
            //convert letter to stars
            String result=   convertLetterToStar(element);
            resultsOfHiddenPasswords[index++]=result;
        }


        return resultsOfHiddenPasswords;
    }

    // this method will get the string it will convert into the stars
    public static String convertLetterToStar(String eachWord) {
        //one
        String temp="";
        for (int i = 0; i < eachWord.length(); i++) { // this basically means 'eachWord.Length' number of * are added into the Temp variable --> ***
            //  eachWord.charAt(i);
            temp+="*"; //at the end of the for loop, there will be *** in the temp variable.
        }
        return temp;

    }
}