package SearchingAlgorithms;

public class LinearSearchAlgorithms {
    public static void main(String[] args) {
        int[]arr = {3,4,62,7,5,7};
        int findNumber = 62;
        int x = linearSearchAlgorithm(arr,findNumber);
        if(x != -1) {
            System.out.println("There is no match found.");
        } else {
            System.out.println("There is a match found");
        }
    }

    private static int linearSearchAlgorithm(int[] arr, int findNumber) {
        for(int i = 0; i<arr.length;i++) {
            if(arr[i] == findNumber) {
                return 1;
            }
        }
        return -1;
    }
}
