package org.jy;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

public class FizzBuzz {

    private int n;

    private volatile int count;

    private Semaphore lock;

    public FizzBuzz(int n) {
        this.n = n;
        count = 1;
        lock = new Semaphore(1);
    }

    public void fizz(Runnable printFizz) throws InterruptedException {
        // printFizz.run() outputs "fizz"
        for (; ; ) {
            lock.acquire(1);
            if (count > n) {
                return;
            }
            if (count % 3 == 0 && count % 5 != 0) {
                printFizz.run();
                count++;
            }
            lock.release(1);
        }
    }

    public void buzz(Runnable printBuzz) throws InterruptedException {
        // printBuzz.run() outputs "buzz"
        for (; ; ) {
            lock.acquire(1);
            if (count > n) {
                return;
            }
            if (count % 3 != 0 && count % 5 == 0) {
                printBuzz.run();
                count++;
            }
            lock.release(1);
        }
    }

    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        // printFizzBuzz.run() outputs "fizzbuzz"
        for (; ; ) {
            lock.acquire(1);
            if (count > n) {
                return;
            }
            if (count % 3 == 0 && count % 5 == 0) {
                printFizzBuzz.run();
                count++;
            }
            lock.release(1);
        }
    }

    public void number(IntConsumer printNumber) throws InterruptedException {
        // printNumber.accept(x) outputs "x", where x is an integer
        for (; ; ) {
            lock.acquire(1);
            if (count > n) {
                return;
            }
            if (count % 3 != 0 && count % 5 != 0) {
                printNumber.accept(count);
                count++;
            }
            lock.release(1);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        FizzBuzz fizzBuzz = new FizzBuzz(15);

        new Thread(() -> {
            try {
                fizzBuzz.fizz(() -> System.out.print("fizz "));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                fizzBuzz.buzz(() -> System.out.print("buzz "));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                fizzBuzz.fizzbuzz(() -> System.out.print("fizzbuzz "));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                fizzBuzz.number((x) -> System.out.print(x + " "));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

}
