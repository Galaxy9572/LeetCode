package org.jy;

import java.util.concurrent.atomic.AtomicInteger;

// LeetCode 1114
public class Foo {

    private AtomicInteger count;

    public Foo() {
        count = new AtomicInteger(1);
    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        while (true) {
            if (count.get() == 1) {
                printFirst.run();
                count.addAndGet(1);
                break;
            }
        }

    }

    public void second(Runnable printSecond) throws InterruptedException {

        // printSecond.run() outputs "second". Do not change or remove this line.
        while (true) {
            if (count.get() == 2) {
                printSecond.run();
                count.addAndGet(1);
                break;
            }
        }
    }

    public void third(Runnable printThird) throws InterruptedException {

        // printThird.run() outputs "third". Do not change or remove this line.
        while (true) {
            if (count.get() == 3) {
                printThird.run();
                break;
            }
        }

    }

    public static void main(String[] args) {
        Foo foo = new Foo();

        new Thread(() -> {
            try {
                foo.second(() -> System.out.print("two"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                foo.third(() -> System.out.print("three"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                foo.first(() -> System.out.print("one"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

}
