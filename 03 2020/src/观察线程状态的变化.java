import java.util.concurrent.TimeUnit;

public class 观察线程状态的变化 {
    private static class AThread extends Thread {
        @Override
        public void run() {
            try {
                for (int i = 0; i < 3; i++) {
                    System.out.println("工作中");
                    TimeUnit.SECONDS.sleep(1);
                    // 1001 ms  1ms 是在执行 sout，剩下的 1000 ms 都是执行 sleep
                    // 从概率上来讲 1000/1001 看到的是 TIMED_WAITING
                    //              1/1001 看到 RUNNABLE
                }
            } catch (InterruptedException e) {}
        }
    }

    public static void main(String[] args) throws InterruptedException {
        AThread a = new AThread();
        System.out.println(a.getState());   // NEW
        a.start();
        System.out.println(a.getState());   // RUNNABLE
        TimeUnit.SECONDS.sleep(2);
        System.out.println(a.getState());   // TIMED_WAITING // 因为刚好 a 线程在执行 sleep
        TimeUnit.SECONDS.sleep(2);
        System.out.println(a.getState());   // TERMINATED
    }
}
