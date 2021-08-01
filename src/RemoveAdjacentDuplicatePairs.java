public class RemoveDuplicateChar {

    public static String removeDuplicate(String str){

        char[] arr=str.toCharArray();
        int j=1;
        char lastChar=arr[0];
        for (int i=1; i<arr.length; i++){
            if (j>0 && arr[i] == arr[j-1]){
            lastChar=arr[j-1];
                while (j>0 && arr[j-1]==lastChar){
                    j--;
                 }
            }
            else if (arr[i] == lastChar){
                //
                continue;
           
 }
            else {
                arr[j++]=arr[i];    //arr[1]=b
                //System.out.println(arr.toString());
            }
        }

        return new String(arr,0,j);
    }

    public static void main(String[] args) {
        String str="abbbc";
        System.out.println(removeDuplicate(str));
    }
}
