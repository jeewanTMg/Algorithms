package SearchingAlgorithms;

import SortingAlgorithms.BubbleSort;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {4,3,10,7,4,6};
        BubbleSort.bubbleSortAlgorithmUsingTwiceForLoop(arr);
        int x = searchBinarySearch(arr,10);
        if(x !=-1) {
            System.out.println("There is value in the array");
        } else {
            System.out.println("There is not value contain in the array.");
        }
    }

    private static int searchBinarySearch(int[] arr, int i) {
        int high = arr.length-1;
        int low =0;

        while(low<=high) {
            int mid = low + (high-low)/2;
            if(arr[mid] == i)
                return arr[mid];

            if(arr[mid]<i) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return -1;
    }
}
