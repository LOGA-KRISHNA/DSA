import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hello {
    public static void main(String[] args) {
        int n=10;
        int k=n;
        int add=1;
        ArrayList<ArrayList<Integer>> marr=new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer> arr=new ArrayList<>();
            for(int j=0;j<k-1;j++){
                arr.add(1);
            }
            arr.add(add++);
            marr.add(arr);
            k--;
        }
        System.out.println(marr);
    }
}
/*
 * 4
 * [[1,1,1,1],[1,1,2],[1,3],[4]]
 * 
 * 
 */