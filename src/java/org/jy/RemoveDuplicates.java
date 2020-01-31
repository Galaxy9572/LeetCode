package org.jy;

/**
 * 26、移除数组中重复数字
 *
 * @author LJY
 */
public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        System.out.println(new RemoveDuplicates().removeDuplicates(new int[]{0, 0, 2, 2, 5, 4, 1, 1, 2}));
    }

}
