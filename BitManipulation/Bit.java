package BitManipulation;
import java.util.Scanner;

class Bit{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //int[] arr={1,1,2,3,2,4,5,4,5};
        //System.out.println(Integer.toHexString("100000"));
        int num=9;
        num=num>>1;
        System.out.println(num);
    }
    static boolean isEven(int num){
        if((num&1)==1) return false;
        return true;
    }

    static int FindUnique(int[] arr){
        int ans=0;
        for (int i : arr) {
            ans^=i;
        }
        return ans;
    }
    static int magicNum(int num){
        int ans=0;
        int base=5;
        while(num>0){
            int lastbin=num&1;
            num=num>>1;
            ans+=(lastbin*base);
            base*=5;
        }
        return ans;
    }
}