package org.jy;

import java.util.HashSet;
import java.util.Set;

/**
 * 961. 重复 N 次的元素
 *
 * @author LJY
 */
public class RepeatedNTimes {

    public int repeatedNTimes(int[] A) {
        Set<Integer> set = new HashSet<>(A.length / 2 + 1);
        for (int i : A) {
            if (!set.add(i)) {
                return i;
            }
        }
        return 0;
    }

}
