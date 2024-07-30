package Permutation;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Permutation46{
    public static void main(String[] args) {
        ArrayList<List<Integer>> mainls=new ArrayList<>();
        int arr1[]={1,2,3};
        List<Integer> arr=Arrays.asList(arr1);
        for (Integer i = 0; i <arr.size() ; i++) {
            List<Integer> subarr=new ArrayList<>();
            subarr.add(arr.get(i+1));

            Arrays.copyOfRange(arr,i+1,arr.size());
        //    subarr= Arrays.asList(Arrays.copyOfRange(arr, 0, i+1));
        }
        // mainls.add(subarr);
        
    }

}
/*
 * 
 *  Input: nums = [1,2,3]
    Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 */