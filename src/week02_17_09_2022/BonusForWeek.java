package week02_17_09_2022;

import java.time.LocalDateTime;

public class BonusForWeek {

    public static void main(String[] args) {

        /* Write a Java Program that writes the current time.

       Output: current time x:xx:xx
            hours:minutes"seconds

         */

        LocalDateTime today = LocalDateTime.now();
        System.out.println("today = " + today);

        int hour = today.getHour();
        System.out.println("hour = " + hour);

        int minute = today.getMinute();
        System.out.println("minute = " + minute);

        int second = today.getSecond();
        System.out.println(hour+":"+minute+":"+second);



    }
}
