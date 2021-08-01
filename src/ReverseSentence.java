public class ReverseSentence {

    public String getReverse(String s){
        String [] sArr= s.split(" ");
        int len=sArr.length;
        String ans="";

        for(int i=len-1;i>=0;i--){
            ans=ans+sArr[i]+" ";
        }
      return ans;
    }

    public static void main(String[] args) {
        ReverseSentence rs= new ReverseSentence();
        System.out.println(rs.getReverse("i am a boy"));
    }
}
