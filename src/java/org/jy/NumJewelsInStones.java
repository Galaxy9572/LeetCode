package org.jy;

import java.util.HashSet;

/**
 * 771. 宝石与石头
 *
 * @author LJY
 */
public class NumJewelsInStones {

    public int numJewelsInStones(String J, String S) {
        if (J == null || "".equals(J) || S == null || "".equals(S)) {
            return 0;
        }
        HashSet<Character> jewelSet = new HashSet<>(J.length());
        J.chars().forEach(e -> jewelSet.add((char)e));
        return (int)S.chars().filter(e -> jewelSet.contains((char)e)).count();
    }

    public static void main(String[] args) {
        System.out.println(new NumJewelsInStones().numJewelsInStones("Aa","aAAbbbb"));
    }

}
