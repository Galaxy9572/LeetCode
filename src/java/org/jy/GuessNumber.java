package org.jy;

// https://leetcode-cn.com/problems/guess-numbers/submissions/
public class GuessNumber {

    public int game(int[] guess, int[] answer) {
        int count = 0;
        for (int i = 0; i < guess.length; i++) {
            count += guess[i] == answer[i] ? 1 : 0;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new GuessNumber().game(new int[]{1,2,3},new int[]{1,3,2}));
    }

}
