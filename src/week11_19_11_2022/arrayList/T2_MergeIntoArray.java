package week11_19_11_2022.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class T2_MergeIntoArray {

     /*
Task 2 :
Create a method that get two arraylists as a parameters then return the array which contains all elements in it.
input:
first arraylist :1,2,3
second arraylist :4,5,6
output:
1,2,3,4,5,6
     */

    public static void main(String[] args) {
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(4, 5, 6));

        System.out.println(first);
        System.out.println(second);


        int[] merge = mergeIntoArray(first,second);
        System.out.println(Arrays.toString(merge));

    }

    public static int[] mergeIntoArray(ArrayList<Integer> first, ArrayList<Integer> second){
        int[] result = new int[first.size()+second.size()];// here we have created an array with enough size to contain all the elements in the 1st & 2nd Arraylists

        int index =0;
        for (Integer eachElement : first) {
            result[index++]=eachElement; // index++ increases the index number because it needs to assign eachElement to a new index number - 1,2,3
        }
        System.out.println(index);// at this point - int index = 3

        for (Integer eachElement : second) {
            result[index++]=eachElement; // which means index in this loop is going to be 4,5,6
        }

        return result;

    }


}
