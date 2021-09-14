public class TwoStringsAnagram {

    public static boolean checkAnagram(String str1,String str2){
        if(str1.length() !=str2.length()){
            return false;
        }
         int checker[] = new int[128];
        char [] str1Chars= str1.toCharArray();
        for(int i=0;i<str1Chars.length;i++){
            checker[str1Chars[i]]++;
        }
        char [] str2Chars= str2.toCharArray();
        for(int i=0;i<str2Chars.length;i++){
            checker[str2Chars[i]]--;

            if(checker[str2Chars[i]]<0){
                 return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        String str1="aba";
        String str2="abb";
       // String str1="abd";
       // String str2="cab";
        System.out.println(checkAnagram(str1,str2));
    }
}
