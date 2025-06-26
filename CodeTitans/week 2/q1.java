import java.util.*;
public class q1{
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> h = new HashMap<>();
        HashMap<Character,Integer> p = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
             char ch2 =t.charAt(i);
            p.put(t.charAt(i),p.getOrDefault(ch2,0)+1);
            h.put(s.charAt(i),h.getOrDefault(ch,0)+1);
        }
       
        if(h.equals(p)){
            return true;
        }
        return false;
    }
    public static void main(String args[]){

    }
}