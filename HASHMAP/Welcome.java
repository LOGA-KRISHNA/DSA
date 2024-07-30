package HASHMAP;

import java.util.HashMap;
import java.util.Map;

public class Welcome {
    public static void main(String[] args) {
        String ans="Logaa";
        System.out.println(canConstruct("aa", "ab"));
    }
    static boolean canConstruct(String ransomNote, String ans) {
        Map<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < ans.length(); i++) {
            if(!map.containsKey(ans.charAt(i))){
                map.put(ans.charAt(i), 1);
            }else{
                int c=map.get(ans.charAt(i));
                map.put(ans.charAt(i), c+1);
            }
        }
        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            if(map.containsKey(ch) && map.get(ch)>0){
                int c=map.get(ch);
                map.put(ch,c-1);
            }
            else return false;
        }
        return true;
    }
}
