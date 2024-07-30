package Reccursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

class ArraLS{
    public static void main(String[] args) {
        int[] arr={1,4,2,6,7,6,1};
        System.out.println(FindAll(arr, 1, 0, new ArrayList<>()));
    }
   //  =new ArrayList<>();
    static ArrayList<Integer> FindAll(int[] arr,int target,int i,ArrayList<Integer> list){
            if(i==arr.length){
                return list;
            }
            if(target==arr[i]){
                list.add(i);
            }

           return FindAll(arr, target, i+1,list);
    }
}