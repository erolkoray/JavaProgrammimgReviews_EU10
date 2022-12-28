package week02_17_09_2022;

public class ConvertMinutesToYearAndDay {


    public static void main(String[] args) {

        /* Create a class called ConvertMinutesToYearAndDay,
        write a Java program to convert minutes into a number of years and days.

        Input the number of minutes: 3456789
        Expected output: 345679 minutes is approximately 6 years and 210 days.
         */

        int givenMinutes = 3456789;
        int howManyMinutesInAYear=(24*365*60);
        int years = givenMinutes/howManyMinutesInAYear;
        System.out.println("years = " + years);
        int remainderMinutes = givenMinutes%howManyMinutesInAYear;
        System.out.println("remainderMinutes = " + remainderMinutes);
        int days = remainderMinutes / (24*60);
        System.out.println("days = " + days);






        System.out.println(givenMinutes + " minutes is approximately " + years + " years and " + days+" days.");



    }

}
