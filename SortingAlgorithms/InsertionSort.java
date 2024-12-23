package SortingAlgorithms;

public class InsertionSort {
    public static void main(String[] args) {
        int []arr = {6,5,4,2};
        insertionSortAlgorithm(arr);
        for(int x: arr){
            System.out.println(x);
        }
    }

    private static void insertionSortAlgorithm(int[] arr) {
        for(int i =1; i<arr.length; i++) {
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]> key) {
               arr[j+1] = arr[j];
               j--;
            }
            arr[j+1] = key;
        }
    }
}
