package week02_17_09_2022;

public class TemperatureConverter {

    public static void main(String[] args) {


        /*
        6. Create class named TemperatureConverter and make a main method


                    - Write a Java program to convert temperature from Fahrenheit to Celsius degree
                    - Input a degree in Fahrenheit: 212

                        Formula: C = (5(F-32))/9
                        Expected output: 212.0 degree Fahrenheit is equal to 100.0 in Celsius.
         */

        double Fahrenheit=(int)212.5;
        double Celsius = (5*(Fahrenheit-32))/9;

        System.out.println(Fahrenheit + " degree Fahrenheit is equal to " + Celsius+" in Celsius.");



    }
}
