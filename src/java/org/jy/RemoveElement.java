package org.jy;

/**
 * 27、移除元素
 *
 * @author LJY
 */
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        int length = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                length++;
            }else{
                nums[i] = nums[length];
            }
        }
        for (int num : nums) {
            System.out.print(num+" ");
        }
        return length;
    }

    public static void main(String[] args) {
        System.out.println(new RemoveElement().removeElement(new int[]{0,1,2,2,3},2));
    }

}
