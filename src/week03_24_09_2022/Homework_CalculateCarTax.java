package week03_24_09_2022;

public class Homework_CalculateCarTax {
    public static void main(String[] args) {

        /* Task 5: Create a class which is "CalculateCarTax"
        if the price between $20000 and $39999 taxRate=0.2
        if the price between $40000 and $59999 taxRate=0.3
        if the price between $60000 and $80000 taxRate=0.4
         */
        int price = 78000;

        if (price >= 20000 && price <= 39999) {
            System.out.println("Car price is: "+ 0.2* price);
        }else if (price >= 40000 && price <= 59999) {
            System.out.println("Car price is: "+ 0.3* price);
        }else if (price >= 60000 && price <= 80000){
            System.out.println("Car price is: "+ 0.4* price);
        }
    }
}
