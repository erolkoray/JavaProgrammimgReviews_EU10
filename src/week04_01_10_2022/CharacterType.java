package week04_01_10_2022;

public class CharacterType {

    public static void main(String[] args) {


        char ch = '4';

        boolean isUpperCase = ch>='A'&& ch<='Z',
                isLowerCase = ch>='a'&& ch<='z',
                isNotAlphabetic = !isUpperCase && !isLowerCase;


        if(isUpperCase){
            System.out.println(ch+ " is an UpperCase character");
        } else if (isLowerCase) {
            System.out.println(ch+ " is an LowerCase character");
            
        } else {
            System.out.println(ch + " is not alphabetic");
        }



    }
}
/*
Given a character, the task is to check whether the given character is in upper case, lower case, or non-alphabetic         character

                            Input: ch = 'A'
                            Output: A is an UpperCase character

                            Input: ch = 'a'
                            Output: a is an LowerCase character

                            Input: ch = '0'
                            Output: 0 is not an aplhabetic character
 */