package org.jy;


import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.function.IntConsumer;

public class ZeroEvenOdd {

    private int n;

    private CyclicBarrier cyclicBarrier;

    private CountDownLatch countDownLatch1;

    private CountDownLatch countDownLatch2;

    public ZeroEvenOdd(int n) {
        this.n = n;
        cyclicBarrier = new CyclicBarrier(3);
        countDownLatch1 = new CountDownLatch(1);
        countDownLatch2 = new CountDownLatch(1);
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        try {
            for (int i = 1; i <= n; i++) {
                printNumber.accept(0);
                countDownLatch1.countDown();
                cyclicBarrier.await();
            }
        } catch (BrokenBarrierException e) {
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        try {
            for (int i = 1; i <= n; i++) {
                countDownLatch1.await();
                if (i % 2 == 0) {
                    printNumber.accept(i);
                }
                countDownLatch2.countDown();
                cyclicBarrier.await();
            }
        } catch (BrokenBarrierException e) {
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        try {
            for (int i = 1; i <= n; i++) {
                countDownLatch2.await();
                if (i % 2 != 0) {
                    printNumber.accept(i);
                }
                cyclicBarrier.await();
                countDownLatch1 = new CountDownLatch(1);
                countDownLatch2 = new CountDownLatch(1);
            }
        } catch (BrokenBarrierException e) {
        }
    }

    public static void main(String[] args) {
        ZeroEvenOdd zeroEvenOdd = new ZeroEvenOdd(9);

        new Thread(() -> {
            try {
                zeroEvenOdd.zero(System.out::print);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                zeroEvenOdd.even(System.out::print);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                zeroEvenOdd.odd(System.out::print);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}