package SortingAlgorithms;

public class BubbleSort {
    public static void main(String[] args) {
      int [] arr = {4,3,10,7,4,6};
        bubbleSortAlgorithmUsingTwiceForLoop(arr);
       // bubbleSortAlorithmsUisngWhileLoop(arr);
      for (int x : arr) {
          System.out.println(x);
      }
    }

    public static void bubbleSortAlorithmsUisngWhileLoop(int[]arr) {
        boolean isSwapRequired = true;
        while(isSwapRequired) {
            isSwapRequired = false;
            for(int i=0;i<arr.length-1;i++) {
                if(arr[i]>arr[i+1]) {
                    //swap number with the smallest one
                   int temp = arr[i+1];
                   arr[i+1] = arr[i];
                   arr[i] = temp;
                   isSwapRequired = true;
                }
            }
        }
    }

    public static void bubbleSortAlgorithmUsingTwiceForLoop(int[]arr) {

        for(int i =0; i<arr.length-1;i++) {
            boolean swap = false;

            for(int j = 0;j<arr.length-1-i;j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if(Boolean.FALSE.equals(swap)) {
                break;
            }
        }

    }
}
