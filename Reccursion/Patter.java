package Reccursion;

public class Patter {
    public static void main(String[] args) {
        patter2(4,0);
        patter1(4, 0);
    }

    static void patter1(int r,int c){
        if(r==0){
            return;
        }
        else if(c<r){
            System.out.print("* ");
            patter1(r, c+1);
        }else{
            System.out.println();
            patter1(r-1, 0);
        }
    }
    static void patter2(int r,int c){
        if(r==0){
            return;
        }
        else if(c<r){
            patter2(r, c+1);
            System.out.print("* ");
            
        }else{
            patter2(r-1, 0);
            System.out.println();
            
        }
    }
}
