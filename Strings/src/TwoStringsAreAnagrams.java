import java.util.Arrays;

public class TwoStringsAreAnagrams {

    public static Boolean checkAnagram(String str1, String str2) {
        int[] checker = new int[256];
        char[] chars = str1.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char cur_char=chars[i];
            checker[cur_char] = checker[cur_char] + 1;
        }
        Arrays.stream(checker).forEach(System.out::print);
        System.out.println();

        for (int i = 0; i < str2.length(); i++) {
            char cur_char=str2.charAt(i);
            checker[cur_char] = checker[cur_char] - 1;
              if(checker[cur_char]<0){
                        return false;
              }
        }
        Arrays.stream(checker).forEach(System.out::println);
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkAnagram("asdsd","dasds"));
    }
}
