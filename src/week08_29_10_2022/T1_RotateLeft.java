package week08_29_10_2022;

import java.util.Arrays;

public class T1_RotateLeft {

    public static void main(String[] args) {

        int[] x = {1,2,3};

        int temp = x[0];

        for (int i = 0; i < x.length-1; i++) {

            x[i]=x[i+1];
            
        }
        x[x.length-1]=temp;

        System.out.println(Arrays.toString(x));

        System.out.println("------------------------------------------------------------");
        
        int[] y = {17,12,10,8};

        int temp2 = y[0];

        for (int i = 0; i < y.length-1; i++) {
            y[i]=y[i+1];
        }
        //last index
        y[y.length-1]=temp2;

        System.out.println(Arrays.toString(y));

        System.out.println("------------------------------------------------------------");
        
        int[] a = {7,0,0};

        int temp3 = a[0];

        for (int i = 0; i < a.length-1; i++) {
            a[i]=a[i+1];
        }
        //last index
        a[a.length-1]=temp3;

        System.out.println(Arrays.toString(a));

        
        





    }
}
/*
Task 1    : Write a program that accepts an array and prints an array with the elements "rotated left”
        
        int[] x = {1,2,3};             // = > [2,3,1]
        int[] y = {17,12,10,8};         // = > [12,10,8,17] 
        int[] a = {7,0,0};              // = > [0,0,7]
        
 */