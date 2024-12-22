package otheralgorithms;

public class SlideWindowAlgorithms {
    public static void main(String[] args) {
     int arr [] = {1,2,3,-10,-3};
     int k =4;
        System.out.println(largestNumber(arr,arr.length,k));
    }


    //Largest sum subarray with at-least k numbers
    public static int largestNumber(int[]arr, int n, int k) {
        int maxSum[]  = new int[n];
        maxSum[0] = arr[0];

        int curr_max = 0;
        for(int i =1; i<n; i++) {
            curr_max = Math.max(arr[i],curr_max+arr[i]);
            maxSum[i] = curr_max;
        }

        //sum of first k element
        int sum = 0;
        for(int i=0;i<k;i++) {
            sum += arr[i];
        }
        //uisng the concept of sliding window
        int result= sum;
        for(int i=k;i<n; i++) {
            sum = sum+arr[i]-arr[i-k];
            result = Math.max(result,sum+maxSum[i-k]);
        }
   return result;
    }
}
