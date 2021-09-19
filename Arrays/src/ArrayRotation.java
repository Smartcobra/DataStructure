import java.util.Arrays;

public class ArrayRotation {


    public int[] leftRotate(int arr[], int d) {
        int output[]= new int[arr.length];
        for (int i = 0; i < d; i++) {
            output = leftRotateOne(arr);
        }
        return output;
    }

    private int[] leftRotateOne(int[] arr) {
        int len=arr.length;
        int tmp=arr[0];
        for(int i=0;i<len-1;i++){
            arr[i]=arr[i+1];
        }
        arr[len-1]=tmp;
        return arr;
    }

    public static void main(String[] args) {
        ArrayRotation rotate = new ArrayRotation();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int[] ints = rotate.leftRotate(arr, 2);
        Arrays.stream(ints).forEach(t-> System.out.print(t+" "));
       /// Arrays.stream(ints).forEach(System.out::print);
    }
}
