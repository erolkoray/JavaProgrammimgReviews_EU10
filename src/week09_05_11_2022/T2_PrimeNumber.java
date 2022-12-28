package week09_05_11_2022;

import java.util.Scanner;

public class T2_PrimeNumber {

    public static void main(String[] args) {

        /*
        Task 2 :   Write a method that can check if a number is prime or not

                Note : Prime numbers are special numbers, greater than 1, that have exactly two factors, themselves and 1
         */
        Scanner scan = new Scanner(System.in);
        boolean result = isPrime(scan.nextInt());
        System.out.println(result);


    }

    public static boolean isPrime(int number) {

        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number > 0 && number % i == 0) {
                isPrime = false;
                break;

                } else {
                    isPrime = true;
                    break;
                }
            }

        return isPrime;
    }
}
