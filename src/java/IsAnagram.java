import java.util.*;
import java.util.stream.Collectors;

/**
 * https://leetcode-cn.com/problems/valid-anagram/
 * @author LJY
 */
public class IsAnagram {

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        if(s.equals(t)){
            return true;
        }
        Map<Character,Integer> sMap = new HashMap<>(s.length());
        Map<Character,Integer> tMap = new HashMap<>(t.length());
        for (char c : s.toCharArray()) {
            Integer count = sMap.get(c);
            if(count == null){
                sMap.put(c,1);
            }else {
                sMap.put(c,++count);
            }
        }

        for (char c : t.toCharArray()) {
            Integer count = tMap.get(c);
            if(count == null){
                tMap.put(c,1);
            }else {
                tMap.put(c,++count);
            }
        }

        return sMap.equals(tMap);
    }


    public boolean isAnagram2(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        if(sChars.length != tChars.length){
            return false;
        }
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        for (int i = 0; i < sChars.length; i++) {
            if(sChars[i] != tChars[i]){
                return false;
            }
        }
        return true;
    }

}
