package org.jy;

import java.util.HashMap;
import java.util.Map;

/**
 * 1、两数之和
 *
 * @author LJY
 */
public class TwoSum {

    public int[] twoSum(int[] numbers, int target) {
        int length = numbers.length;
        Map<Integer, Integer> map = new HashMap<>(length);
        for (int i = 0; i < length; i++) {
            map.put(numbers[i], i);
        }
        for (int i = 0; i < length; i++) {
            Integer anotherNum = target - numbers[i];
            if (map.containsKey(anotherNum) && map.get(anotherNum) != i) {
                return new int[]{i, map.get(anotherNum)};
            }
        }
        throw new RuntimeException("No such index");
    }

}
