public class ReverseStringWhile {

    public String getReverse(String s){
        char[] ch= s.toCharArray();
         char tmp;
          int i=0;
          int j=s.length()-1;

          while(i<j){
              tmp=ch[i];
              ch[i]=ch[j];
              ch[j]=tmp;
              i++;
              j--;

          }

        return  new String(ch);

    }

    public static void main(String[] args) {
        System.out.println("from --ReverseStringWhile");
        ReverseStringWhile rs = new ReverseStringWhile();
        System.out.println(rs.getReverse("acb"));
    }
}
