package week05_08_10_2022;

import java.util.Scanner;

public class EncryptPassword {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a password");


        String password = scan.next();
        char encryptWith = 'X';
        String encryptedPass = "";
        for (int i = 0; i < password.length(); i++) {
            encryptedPass +=""+password.charAt(i) + encryptWith; // this and line below do the same thing. This is shorter
        //  encryptedPass = "" + encryptedPass + password.charAt(i) + encryptWith;

        }

        System.out.println(encryptedPass);
        scan.close();
    }
}

/*
Task 9: Given a string password. Encrypt with "x" a given password and print.

    Hint: do with for loop

     * password: cydeo
     * encrypt with char :x
     * output:cxyxdxexox
 */