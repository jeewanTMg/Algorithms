package SortingAlgorithms;

public class MergeSort {
    public static void main(String[] args) {
        int []arr = {6,5,4,2};
        mergeSortAlgorithms(arr);
        for(int x: arr){
            System.out.println(x);
        }
    }

    private static void mergeSortAlgorithms(int[] arr) {
        int len = arr.length;
        if(len<=1) {
            return;
        }
        int mid = arr.length/2;
        int[] left = new int[mid];
        for(int i =0; i<mid;i++) {
            left[i] = arr[i];
        }

        int[]right = new int[arr.length-mid];
        for(int i =mid; i<arr.length;i++) {
            right[i-mid] = arr[i];
        }

        mergeSortAlgorithms(left);
        mergeSortAlgorithms(right);
        conqureLeftAndRightArrayMerge(arr,left,right);

    }

    private static void conqureLeftAndRightArrayMerge(int[] arr, int[] left, int[] right) {
        int l=0,r=0,j=0;
        while(l<left.length && r<right.length) {
            if(left[l]<right[r]) {
                arr[j++] = left[l++];
            } else {
                arr[j++] = right[r++];
            }
        }

        while(l<left.length) {
            arr[j++] = left[l++];
        }
        while(r<right.length) {
            arr[j++] = right[r++];
        }
    }
}
