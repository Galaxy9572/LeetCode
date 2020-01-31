package org.jy;

/**
 * 476. 数字的补数
 *
 * @author LJY
 */
public class FindComplement {

    public int findComplement(int num) {
        return ~num & (Integer.highestOneBit(num) - 1);
    }

    public static void main(String[] args) {
        System.out.println(Integer.highestOneBit(5) - 1);
    }

}
