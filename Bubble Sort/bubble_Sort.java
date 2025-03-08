//package Sorting;

import java.util.Scanner;

class bubble{
    void bSort(int[] array,int n){
        //bubble sort algorithm.
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++) {
                if(array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
public class bubble_Sort {
    public static void main(String[] args) {
        int i,n;
        int[] array;
        Scanner get =new Scanner(System.in);

        // for input in an Array.
        System.out.println();
        // making dynamic array declaration.
        System.out.print("Number Of Element You Want to Sort: ");
        n= get.nextInt();

        array=new int[n]; //assign size in an array.

        System.out.println("Input Elements In An Array:---");

        for(i=0;i<n;i++) {
            System.out.print("Enter "+(i+1)+" Element: ");
            array[i] = get.nextInt();
        }
        System.out.println("-----------------------------------");

        //display Before sorting.
        System.out.println("UnSorted Data Are:-");
        for(i=0;i<n;i++){
            System.out.print(" "+array[i]);
        }
        System.out.println();
        System.out.println("-----------------------------------");

        bubble obj= new bubble();
        obj.bSort(array,n);

        //display After sorting.
        System.out.println("Data Are Sorted Using Bubble Sort ");
        for (i=0;i<n;i++){
            System.out.print(" "+array[i]);
        }
        System.out.println();
        System.out.println("-----------------------------------");
    }
}
