import java.util.Arrays;
import java.util.Comparator;

public class SortTheArray {

    public static void main(String[] args) {
        int [] arr={2,2,-2,-1,3,1,4,-5,6,7,5,-7,8,-8,-8,9};
        Integer[] integers = Arrays.stream(arr).boxed().toArray(t->new Integer[arr.length]);

        //Integer[] integers = Arrays.stream(arr).boxed().toArray(Integer[]::new);

       /* Arrays.sort(integers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Math.abs(o1)-Math.abs(o2);
            }
        } );*/

        Arrays.sort(integers, (o1,o2)->Math.abs(o2)-Math.abs(o1));  //sorting can be controlled here
        //Arrays.sort(integers, Comparator.comparingInt(Math::abs));  //natural sorting ascending

        Arrays.stream(integers).forEach(t->System.out.print(t+" ,"));



    }
}
