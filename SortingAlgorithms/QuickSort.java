package SortingAlgorithms;

import java.util.Collections;


public class QuickSort {
    public static void main(String[] args) {
        int []arr = {6,5,4,2};
        quickSortAlgorithms(arr,0,arr.length-1);
        for(int x: arr){
            System.out.println(x);
        }
    }

    private static void quickSortAlgorithms(int[] arr, int low, int high) {
        if(low< high) {
        int pi = partationArray(arr,low,high);
        quickSortAlgorithms(arr,low,pi-1);
        quickSortAlgorithms(arr,pi+1, high-1);
        }
    }

    private static int partationArray(int[] arr,int low,int high) {
       int pivot = arr[high];
       int i =low-1;

       for(int j = low;j<=high;j++) {
           if(arr[j] < pivot) {
               i++;
               swap(arr,i,j);
           }
       }

        swap(arr,i+1, high);
       return i+1;
    }

    public static void swap(int[]arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
