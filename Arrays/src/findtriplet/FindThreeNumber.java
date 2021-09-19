package findtriplet;

public class FindThreeNumber {
    public boolean isFound(int arr[], int k) {
        int length = arr.length;
        int sum = 0;
        int start;
        int end;

        for (int i = 0; i <= length - 1; i++) {
            start = 0;
            end = length-1;

            while (start < i && end > i) {
                sum = arr[i] + arr[start] + arr[end];
                if (sum > k) end--;
                else if (sum < k) {
                    start++;
                } else {
                    return true;
                }
            }
        }
        return false;
    }
}
