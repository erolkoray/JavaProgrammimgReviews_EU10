package week09_05_11_2022;

public class MethodsIntro {
    public static void main(String[] args) {

        // METHODS ARE REUSABLE CODE BLOCKS FOR JAVA - (Custom Created)
        printHello5Times(); // prints Hello 5 times

        System.out.println("------------------------------------------------------------------------------");

        // We want to provide two numbers

        int result = sumOfTwoNumbers(3,2);

        // multiply the number with 2 and show in console

        multiplyWith2AndPrint(result); // if you write this and then click option+enter it will automatically create the method associated with this
    }



    public static void multiplyWith2AndPrint(int result) {

        System.out.println(result*2);
    }

    public static int sumOfTwoNumbers(int number1, int number2) {


        return number1+number2;
    }


    public static void printHello5Times(){

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
        }

    }
}
