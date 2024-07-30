import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        System.out.println(match("ABCDEF", "ABC"));
    }
    static void reverse(int[] arr,int s,int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
    static String match(String str1,String str2){
       int n=str1.length();
       int m=str2.length();
        for(int i=0;i<n-m+1;i++){
            int j=0;
            while(j<m && str1.charAt(i+j)==str2.charAt(j)){
                j+=1;
            }
            if(j==m) return str1.substring(j);
        }
        return "";
    }
}
/*
 * 1 2 3 4 5
 * 2 3 4 5 1
 * 3 4 5 1 2
 * 4 5 1 2 3
 */