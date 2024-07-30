import java.util.*;

class Solustion {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog dog dog dog"));
        //  String str="dog cat cat dog";
        //  String[] arr=str.split(" ");
        // for (String string : arr) {
        //      System.out.println(string);
        // }
    }
    static boolean wordPattern(String pattern, String s) {
        String[] arr=s.split(" ");
        Map<Character,String> map=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            if(!map.containsKey(pattern.charAt(i))){
                if(map.containsValue(arr[i])!=(arr[i])) return false;
                map.put(pattern.charAt(i),arr[i]);
            }else{
                String ans=map.get(pattern.charAt(i));
                if(!ans.equals(arr[i])) return false;
            }
        }
        return true;
    }
     static boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map=new HashMap<>();
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                if(map.containsKey(s.charAt(i))!=map.containsValue(t.charAt(i))) return false;
                map.put(s.charAt(i),t.charAt(i));
            }else{
                char ch=map.get(s.charAt(i));
                if(ch!=t.charAt(i)) return false;
            }
        }
        return true;
    }
}


/*
 * Input: s = "egg", t = "add"
Output: true
 */