//package Sorting;

import java.util.Scanner;

class Merge{
    public void Divide(int array[], int start, int end){
        // compare start and end element.
        if(start >= end){
            return;
        }
        // divide the array.
        int mid= start +(end-start)/2;

        Divide(array,start,mid);
        Divide(array,mid+1,end);

        // Conquer function that is to merge the array.

        Conquer(array,start,mid,end);
    }

    public void Conquer(int array[],int start,int mid,int end){

        int[] NewArray =new int[end - start + 1];

        // make two index to track divide array.
        int start1 = start;
        int end1 = mid+1;

        int x=0;

        while(start1 <= mid && end1 <= end){
            if(array[start1] < array[end1]){
                NewArray[x]= array[start1];
                x++;
                start1++;
            } else {
                NewArray[x]= array[end1];
                x++;
                end1++;
            }
        }
        while (start1<= mid){
            NewArray[x]= array[start1];
            x++;
            start1++;
        }
        while (end1<= end){
            NewArray[x]= array[end1];
            x++;
            end1++;
        }
        for(int i=0,j=start; i< NewArray.length; i++,j++){
            array[j]=NewArray[i];
        }
    }
}

public class Merge_Sort {
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

        Merge obj= new Merge();
        obj.Divide(array,0,n-1);

        //display After sorting.
        System.out.println("Data Are Sorted Using Merge Sort");
        for (i=0;i<n;i++){
            System.out.print(" "+array[i]);
        }
        System.out.println();
        System.out.println("-----------------------------------");

    }
}
