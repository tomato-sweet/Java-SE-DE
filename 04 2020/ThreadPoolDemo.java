package thread_pool;

import java.util.Scanner;
import java.util.concurrent.*;

public class ThreadPoolDemo {
    private static long fib(int n) {
        if (n < 2) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }

    private static class CalcTarget implements Runnable {
        private int n;

        CalcTarget(int n) {
            this.n = n;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    TimeUnit.MINUTES.sleep(10);
                }
            } catch (InterruptedException e) {}
        }
    }

    public static void main(String[] args) {
        Executors.newFixedThreadPool(10);
        Executors.newCachedThreadPool();

        ExecutorService pool = new ThreadPoolExecutor(10, 10, 0, TimeUnit.SECONDS, new ArrayBlockingQueue<>(3));
        for (int i = 0; i < 100; i++) {
            System.out.printf("提交第 %d 个任务%n", i + 1);
            pool.execute(new CalcTarget(i));    // 不需要每次都创建线程了
        }
    }
}
