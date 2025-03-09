//package Sorting;

import java.util.Scanner;

class Insertion{
    public void insert_sort(int[] array,int n){
        for(int i=1;i<n;i++){
            int temp = array[i];
            int j = i-1;
            while(j >= 0 && array[j]>temp){
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = temp;
        }
    }
}
public class Insertion_Sort {
    public static void main(String[] args){
        int  n,i;
        int[] array;
        Scanner get =new Scanner(System.in);

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
        System.out.println("UnSorted Data Are---");
        for(i=0;i<n;i++){
            System.out.print(" "+array[i]);
        }
        System.out.println();
        System.out.println("-----------------------------------");

        Insertion obj= new Insertion();
        obj.insert_sort(array,n);

        //display After sorting.
        System.out.println("Data Are Sorted Using Insertion Sort");
        for (i=0;i<n;i++){
            System.out.print(" "+array[i]);
        }
        System.out.println();
        System.out.println("-----------------------------------");
    }
}
