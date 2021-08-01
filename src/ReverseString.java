public class ReverseString {

    public String getReverse(String s){
        char [] ch= s.toCharArray();
        int n=s.length();
        char tmp;

        for(int i=0,j=n-1; i<j;i++,j--){
            tmp=ch[i];
            ch[i]=ch[j];
            ch[j]=tmp;
        }


        return  new String(ch);
    }

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        System.out.println(rs.getReverse("acb"));
    }
}
