public class LargestNumber {

    //Java Program To Find Largest Number Less Than Given Number And Without A Given DIgit
    //number=259 digit=5 o/p is 249
    //number 3559 digit 5 o/p is 3499
    //number 16 digit 6 o/p is 15

    public static int getLessThanN(int num, int digit) {

        char c = Integer.toString(digit).charAt(0);

        for (int i = num; i > 0; i--) {
            if (Integer.toString(i).indexOf(c) == -1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(getLessThanN(16,6));
    }
}
