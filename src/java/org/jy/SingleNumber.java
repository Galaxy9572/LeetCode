package org.jy;

import java.util.*;

/**
 * https://leetcode-cn.com/problems/single-number/
 *
 * @author LJY
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int num : nums) {
            Integer count = map.get(num);
            if (count == null) {
                map.put(num, 1);
            } else {
                map.put(num, ++count);
            }
        }
        return map.entrySet().stream().filter(e -> e.getValue() == 1).findFirst().get().getKey();
    }

    public int singleNumber2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        //如果在中间或开头找不到，那就是最后一个
        return nums[nums.length - 1];
    }

    public int singleNumber3(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int num : nums) {
            if(set.contains(num)){
                set.remove(num);
            } else {
                set.add(num);
            }
        }
        return (Integer)set.toArray()[0];
    }

    public int singleNumber4(int[] nums) {
        //利用a^a=0,a^0=a,x^a^a=x的特性，异或运算，最后得到x
        int ans = nums[0];
        if (nums.length > 1) {
            for (int i = 1; i < nums.length; i++) {
                ans = ans ^ nums[i];
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        System.out.println(new SingleNumber().singleNumber4(new int[]{2, 2,3, 4, 4}));
    }

}
