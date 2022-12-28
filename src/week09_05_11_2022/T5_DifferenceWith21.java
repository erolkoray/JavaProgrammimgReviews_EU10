package week09_05_11_2022;

public class T5_DifferenceWith21 {
    public static void main(String[] args) {

        int result = diff21(19); // 2
        int result2 = diff21(23); // 4

        System.out.println(result);
        System.out.println(result2);


    }

    public static int diff21(int number) {

        return (number <21)?21-number:(number-21)*2; // this is the shorter version of the code below;

     /*   int result = 0;

        if(number <21){
           result = 21-number;
            return result;
        }else {
            result = (21-number)*2;
            return result;
      */
    }
}
/*
Task 5 :  Write a method that return the absolute difference between n and 21, except return double the absolute difference if n is over 21. (n is int)

    method  parameter : no , or what kibd of data type --- interger
    method return type : void? --- integer


             diff21(19) → 2
             diff21(10) → 11
             diff21(23) → 4
 */