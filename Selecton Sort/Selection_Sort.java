//package Sorting;

import java.util.Scanner;

class Selection{
    public void Selection__Sort(int[] array,int n){
        for(int i=0;i<n;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(array[min] > array[j])
                    min=j;
            }
            if(i != min){
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
    }
}

public class Selection_Sort {
    public static void main(String[] args) {
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

        Selection obj= new Selection();
        obj.Selection__Sort(array,n);

        //display After sorting.
        System.out.println("Data Are Sorted Using Selection Sort");
        for (i=0;i<n;i++){
            System.out.print(" "+array[i]);
        }
        System.out.println();
        System.out.println("-----------------------------------");

    }
}
