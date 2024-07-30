package CycleSort;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
    static List<Integer> findDisappearedNumbers(int[] arr) {
        int i=0;
        List<Integer> list=new ArrayList<>();
        while(i<arr.length){
            int corr=arr[i]-1;
            if(arr[i]!=arr[corr]){
                swap(arr, i, corr);
            }else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]-1!=j){
                list.add(j+1);
            }
        }
        //System.out.println(Arrays.toString(arr));
        return list;
    }
    static int fun(int[] arr) {
       int i=0;
       while(i<arr.length){
            //int corr=arr[i];
            if(arr[i]!=i && arr[i]<arr.length){
                swap(arr, i, arr[i]);
            }else{
                i++;
            }
       }
       for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j) return j;
       }
       return arr.length;
    }
    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
   
}
