import java.util.HashSet;
import java.util.Set;

public class MaxSubStringNonRepeating {

    public static int maxSubString(String str){
        int i=0;
        int j=0;
        int max=0;
        Set<Character> set= new HashSet<Character>();

        for(j=0;j<str.length();j++){
            char cur_Char=str.charAt(j);
            if(!set.contains(cur_Char)){
                set.add(cur_Char);
                max=Math.max(max,set.size());
            }else{
                set.remove(str.charAt(i));
                i++;
            }
        }

        return max;

    }

    public static void main(String[] args) {
        System.out.println(maxSubString("abccd"));
    }
}
