package week09_05_11_2022;

public class T1_OddOrEven {

    public static void main(String[] args) {

        //Task 1 :   Write a method that can check if a number is even or odd


        checkIfNumberOddOrEven(8);
        checkIfNumberOddOrEven(33);





    }

    private static void checkIfNumberOddOrEven(int number) {

        if(number%2==0){

            System.out.println(number+" is even");
        }else {
            System.out.println(number+" is odd");
        }
    }
}
