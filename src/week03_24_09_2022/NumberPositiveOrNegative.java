package week03_24_09_2022;

public class NumberPositiveOrNegative {

    public static void main(String[] args) {


        int a = -0;
        boolean aisPositive = a>0;


        if(aisPositive){
            System.out.println("Positive");
        }else if (a==0) {
            System.out.println("Zero");
        }else{
            System.out.println("Negative");
        }
    }
}
