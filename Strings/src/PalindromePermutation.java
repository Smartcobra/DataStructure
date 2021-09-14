

import java.util.HashMap;
import java.util.Map;

public  class PalindromePermutation {
    public static boolean  checkPalindrome(String str){
        str=str.replaceAll("\\s","");
        boolean isEven=false;
        Map<Character,Integer> map= new HashMap<>();
        for(Character s:str.toCharArray()){
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }else{
                map.put(s,1);
            }
        }

        for(Map.Entry<Character,Integer> entry:map.entrySet()){
           // System.out.println(entry.getKey()+"-"+entry.getValue());
           if(entry.getValue()%2==1){
                if(isEven){
                    return false;
                }
                isEven=true;

            }
        }

        return true;
    }

    public static void main(String[] args) {
        boolean taco_cat = checkPalindrome("taco cat");
        System.out.println(taco_cat);

    }
}
