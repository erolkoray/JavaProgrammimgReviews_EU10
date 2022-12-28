package week05_08_10_2022;

import java.util.Scanner;

public class CalculatorWithSwitch {

    public static void main(String[] args) {

        /*
        we will create a basic calculator which has + - / * with switch case
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter first number");
        double num1 = scan.nextDouble();

        System.out.println("Please enter second number");
        double num2 = scan.nextDouble();

        System.out.println("Please enter your operator");
        char operator = scan.next().charAt(0); // this can also be String operator = scan.next()
        // we don't have a nextChar() method, so we need to use our String method which is CharAt(0)
        double result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            default:
                System.out.println("Operator is invalid");

        }
        System.out.println(result);
        scan.close();
    }
}
