package week07_22_10_2022;

public class NestedLoopIntro {


    public static void main(String[] args) {

/*
        for (int i = 1; i <= 5; i++) {      // outer loop will only get executed when the inner loop has completed its actions


            for (int j = 1; j <= 5; j++) {  // this needs to complete its loops before outer loop can continue with its action
                System.out.println("outer loop: " + i + " inner loop: "+j);
            }
        }

 */

            /*
            *******
            *******
            *******
            *******
             */

        int columnNumber = 7;
        int rowNumber = 4;

        for (int i = 0; i < rowNumber; i++) {


            for (int j = 0; j < columnNumber; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
