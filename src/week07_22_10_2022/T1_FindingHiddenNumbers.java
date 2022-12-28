package week07_22_10_2022;

import java.util.Random;
import java.util.Scanner;

public class T1_FindingHiddenNumbers {

    public static void main(String[] args) {


        Random random=new Random();

        int hiddenNumber = random.nextInt(10) + 1; // randomly pick a number from 1 to 10
                                                // if + 2, it would pick a random number from 2-11

        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Enter a number");
            int searchedNumber = scan.nextInt();

                if (searchedNumber == hiddenNumber) {
                    System.out.println("Your found the number, congrats!");
                    break;
                }else{
                    System.err.println("Wrong number, try again");
                }


            }




    }
}
/*
Task 1: Find the number taht given a hidden number between 1 and 100 randomly created.

 Hint:   Random random=new Random();

        int hiddenNumber = random.nextInt(100) + 1;
 */