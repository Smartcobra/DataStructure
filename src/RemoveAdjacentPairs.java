public class RemoveAdjacentPairs {

    public static String solution(String str) {
        int length = str.length();
        char[] stack = new char[length];

        int j=0;
        for(int i=0;i<length;i++){
              char curr_char= str.charAt(i);
                  if(j>0 &&(curr_char==stack[j-1])){
                      j--;
                  }else{
                      stack[j]=curr_char;
                      j++;
                  }
        }
        return new String(stack,0,j);
    }

    public static void main(String[] args) {

        System.out.println(solution("abbbaca"));
    }
}
/*
*     i=0; j=0;
*              cur_char='a';
*        line-10 will not execute
*        line 13 will execute
*           stack=[a,0,0,0,0,0]
*            j=1;
*
*  i=1; j=1
*       cur_char='b';
*           line-10 will not execute ;
*             line -13 will execute because stack has 'a' and cur_char= 'b';
*           stack=[a,b,0,0,0,0];
*           j=2;
*
*  i=2; j=2
 *       cur_char='b';
 *           line-10 will  execute , stack[j-1]==cur_char
 *                                    stack[1]==b;
 *        line -13 will not execute
 *            j=1;
 *           stack=[a,b,0,0,0,0];
 *
*   i=3; j=1
 *       cur_char='a';
 *           line-10 will  execute , stack[j-1]==cur_char or
 *                                    stack[0]==a;
 *        line -13 will not execute
 *            j=0;
 *           stack=[a,b,0,0,0,0];
*
*   i=4; j=0
 *       cur_char='c';
 *           line-10 will not execute ;
 *        line -13 will  execute
 *           stack=[c,b,0,0,0,0];
 *            j=1;
 *
 * i=5; j=1
 *       cur_char='a';
 *           line-10 will not execute ;
 *        line -13 will  execute
 *           stack=[c,a,0,0,0,0];
 *            j=2;
*   end of loop
*    new String(stack,0,j)= new String(stack,0,2)
* */