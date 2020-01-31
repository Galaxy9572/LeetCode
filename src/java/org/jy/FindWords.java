package org.jy;

import java.util.*;

/**
 * 500. 键盘行
 *
 * @author LJY
 */
public class FindWords {

    private static Map<Character, Integer> map = new HashMap<>();

    static {
        String[] strs = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        for (int i = 0; i < strs.length; i++) {
            for (char c : strs[i].toCharArray()) {
                map.put(c, i + 1);
            }
        }
    }

    public String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();
        for (String word : words) {
            String w = word.toLowerCase();
            int seq = map.get(w.charAt(0));
            int count = 0;
            for (char c : w.toCharArray()) {
                if (map.get(c) == seq) {
                    count++;
                }
            }
            if (count == w.length()) {
                list.add(word);
            }
        }
        String[] strs = new String[list.size()];
        return (list.toArray(strs));
    }
}