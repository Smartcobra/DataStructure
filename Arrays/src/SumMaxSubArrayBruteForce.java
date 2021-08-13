public class SumMaxSubArrayBruteForce {

    public static int maxSubArray(int arr[], int k) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= arr.length - k; i++) {
            int tmpMax = 0;
            for (int j = i; j < i + k; j++) {
                tmpMax += arr[j];
            }
            if (tmpMax > max) {
                max = tmpMax;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        System.out.println(maxSubArray(arr, 4));
    }
}
