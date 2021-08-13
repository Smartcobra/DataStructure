public class MaximumSubstring {

    public static int findSumMaxSubArray(int arr[], int k) {
        int length = arr.length;
        int i = 0;
        int ii=0;
        int j = 0;
        int jj=0;
        int sum = 0;
        int max = Integer.MIN_VALUE;

        while (j < length) {
            sum = sum + arr[j];
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                max = Math.max(sum, max);
               // ii=i;
                //jj=j;
                sum = sum - arr[i];
                i++;
                j++;


            }
        }
       // System.out.println(ii+" "+jj);  //for tracking the sub array
        return max;

    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        System.out.println(findSumMaxSubArray(arr, 4));

    }
}
