package org.jy;

import java.util.HashSet;
import java.util.Set;

/**
 * 804. 唯一摩尔斯密码词
 *
 * @author LJY
 */
public class UniqueMorseRepresentations {

    public int uniqueMorseRepresentations(String[] words) {
        if (words == null || words.length == 0) {
            return 0;
        }
        String[] morseCodes = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
                "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> set = new HashSet<>();
        for (String word : words) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                int index = (int) word.charAt(i) - 97;
                stringBuilder.append(morseCodes[index]);
            }
            set.add(stringBuilder.toString());
        }
        return set.size();
    }

    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        System.out.println(new UniqueMorseRepresentations().uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg","dgd","zxc","qwe","oiu"}));
        System.out.println(System.currentTimeMillis() - l);
    }

}
