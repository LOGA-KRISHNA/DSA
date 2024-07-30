package Strings;

public class Basic {
    public static void main(String[] args) {
        String str="abcdaa";
       // removechar("", str);
       //System.out.println(removechar(str));
       
    }
    static String removeapple(String app) {
        if(app.isEmpty()){
            return "";
        }
        if(app.startsWith("apple")){
            int len="apple".length();
            return removeapple(app.substring(len));
        }else{
            return app.charAt(0)+ removeapple(app.substring(1));
        }
    }
    static void removechar(String ans,String m){
        if(m.isEmpty()){
            System.out.println(ans);
            return;
        }
        if(m.charAt(0)=='a'){
            removechar(ans, m.substring(1));
        }
        if(m.charAt(0)!='a'){
            removechar(ans+m.charAt(0), m.substring(1));
        }
    }
    static String removechar(String m){
        if(m.isEmpty()){
            return "";
        }
        if(m.charAt(0)=='a'){
            return removechar(m.substring(1));
        }else{
            return m.charAt(0)+ removechar(m.substring(1));
        }
    }
}
