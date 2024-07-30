package Strings;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        String str="abc";
        combin("",str);
       //System.out.println(combinList("", str));
       //ArrayList<String> ans=combinList("", str);
       //System.out.println(ans);
    }

    static void combin(String p,String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        combin(p, up.substring(1));
        combin(p+ch, up.substring(1));
    }
    static ArrayList<String> combinList(String p,String up) {
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left= combinList(p+ch, up.substring(1));
        ArrayList<String> right= combinList(p, up.substring(1));
        
       left.addAll(right);
        return left;
    }
    
}