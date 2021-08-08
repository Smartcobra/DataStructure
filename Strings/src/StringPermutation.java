import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringPermutation {

    public static void solution(String str){
        int l=0;
        int h=str.length()-1;
        permute(str,l,h);
    }

    public static void permute(String str, int l, int h) {

        if (l == h) {
            System.out.println(str);
        } else {
            for (int i = l; i <= h; i++) {
                str=swap(str, l, i);
                permute(str, l+1, h);
                str=swap(str, l, i);
            }
        }

    }

    public static String swap(String str, int i, int j) {
        char[] chars = str.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;

        return String.valueOf(chars);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
        String str=br.readLine();
        solution(str);

    }


}
