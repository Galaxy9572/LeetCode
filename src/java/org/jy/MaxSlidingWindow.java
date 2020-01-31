package org.jy;

import java.util.PriorityQueue;

/**
 * https://leetcode-cn.com/problems/sliding-window-maximum/
 * @author LJY
 */
public class MaxSlidingWindow {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0 || k <= 0){
            return new int[0];
        }
        int[] result = new int[nums.length - (k-1)];
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> o1.compareTo(o2) * -1);
        for (int i = 0; i <= nums.length - k; i++) {
            for (int j = i; j < k + i; j++) {
                priorityQueue.add(nums[j]);
            }
            result[i] = priorityQueue.peek();
            priorityQueue.clear();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] ints = new MaxSlidingWindow().maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 7);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

}
