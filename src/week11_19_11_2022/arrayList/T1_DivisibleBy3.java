package week11_19_11_2022.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class T1_DivisibleBy3 {

    /*
    Task 1 :
Create a method that which is get arraylist as a parameter then return the numbers which are divisible by 3.
input:
  numbers : 2,3,4,5,6,8,9
output:
3,6,9
     */

    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2,3,4,5,6,7,8,9));

        ArrayList<Integer> result = divisibleBy3(numbers);

        numbers.removeIf(p->!(p%3==0));
        System.out.println(numbers);


    }

    public static ArrayList<Integer> divisibleBy3(ArrayList<Integer> numbers) {

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer number : numbers) {
            if(number%3==0){
                result.add(number);
            }
        }
        return result;
    }

}
