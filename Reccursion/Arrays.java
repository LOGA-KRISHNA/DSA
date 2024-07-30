package Reccursion;

public class Arrays {
    public static void main(String[] args) {
        int[] arr={1,2,-1,4,5};
        int i=0;
        //System.out.println(sorted(arr,i));
        System.out.println(linear(arr, i, -1));
    }

     static boolean sorted(int[] arr,int i) {
        if(i==arr.length-1){
            return true;
        }
        return arr[i]<arr[i+1]&&sorted(arr, i+1);
    }

    static int linear(int[] arr,int i,int target){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        return  linear(arr, i+1, target);
    }
}
