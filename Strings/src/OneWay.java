

public class OneWay {
    /*
    One Away: There are three types of edits that can be performed on strings: insert a character,
remove a character, or replace a character. Given two strings, write a function to check if they are
one edit (or zero edits) away.
EXAMPLE
pale, ple -> true
pales, pale -> true
pale, bale -> true
pale, bae -> false

     */

    public static boolean checkOneWay(String str1, String str2) {
        if (str1.length() == str2.length()) {
            return OneReplace(str1, str2);
        }
        //str1.length>str2.length
        if (str1.length() + 1 == str2.length()) {
            return OneInsert(str1, str2);
        }
        //str2.length>str1.length
        if (str1.length() == str2.length() + 1) {
            return OneInsert(str2, str1);
        }
        return false;
    }

    private static boolean OneInsert(String str1, String str2) {
         int i=0;int j=0;
         while(str1.length()>i &&str2.length() >j){
             if(str1.charAt(i) != str2.charAt(j)){
                 if(i !=j){
                         return false;
                 }
                 j++;
             }else{
                 i++;j++;
             }
         }
        return true;

    }

    private static boolean OneReplace(String str1, String str2) {
        int count=0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
               count++;
            }
        }
        if (count==1){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
        String str1="pale";
        String str2="bae";
        System.out.println(checkOneWay(str1,str2));
    }
}
