package Matrix;

import java.util.Arrays;

public class Mirror {
    public static void main(String[] args) {
        int[][] arr={{9,8,7,11},{5,4,2,12},{1,2,3,13}};
        dislay(arr);
        for (int i = 0; i < arr.length; i++) {
            int j=0;
            arr[i][j+2]=arr[i][j];
            j++;
            //System.out.println();
        }
        System.out.println();
        dislay(arr);
    }
    static void dislay(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
