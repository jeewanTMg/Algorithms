package SortingAlgorithms;

public class SelectionSort {

    //Method Methods
    public static void main(String[] args) {
     int []arr = {6,5,4,2};
     selectionSortingAlgorithms(arr);
     for(int x: arr){
         System.out.println(x);
     }
    }

    //Selection Sorting
    public static void selectionSortingAlgorithms(int[]arr) {
        //looping through the array
        for(int i=0; i<arr.length; i++) {
            int minIndex =0;
            for(int j =i+1; j<arr.length;j++) {
                if(arr[j]<arr[i]) {
                    minIndex = j;
                }
            }
            //Checking wheather we find the Small Index in above inner for loop.
            if(minIndex != 0) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }

        }
    }

}
