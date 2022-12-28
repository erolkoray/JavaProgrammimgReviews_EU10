package week09_05_11_2022;

public class MultiDimensionalArrayIntro {

    public static void main(String[] args) {


        int[] firstArray = {1, 2, 3};
        int[] secondArray = {6, 7, 8, 0};
        int[] thirdArray = {1, 2, 3, 4, 5};

        // WAYS TO CODE MULTI-DIMENSIONAL ARRAYS

        int[][] twoDimensionalArray = {
                {1, 2, 3},    // first array
                {6, 7, 8, 0},  // second array
                {1, 2, 3, 4, 5} // third array
        };

        int[][] array2D = {firstArray, secondArray, thirdArray};
        //                   {1,2,3}     {6,7,8,0}   {1,2,3,4,5}
        // Array index num:     0            1            2
        // Element index no:  0,1,2       0,1,2,3     0,1,2,3,4

        System.out.println(array2D[1][3]); // this results '0' - Array #: 1 & Element #: 3

// index of array which is 0 then I need to go to that element by using index of element which is 1
        System.out.println(array2D[2][2]);
        //3 row number
        for (int i = 0; i < array2D.length; i++) { // in order to go to array one by one
            System.out.println(i + 1 + ". array ");
            //column number
            for (int j = 0; j < array2D[i].length; j++) { // this is for finding element inside inner array
                System.out.println(array2D[i][j]);

            }
            System.out.println("=============");


        }
    }
}