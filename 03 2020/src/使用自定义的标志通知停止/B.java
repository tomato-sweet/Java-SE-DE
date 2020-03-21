package 使用自定义的标志通知停止;

import java.util.concurrent.TimeUnit;

public class B extends Thread {
    private Condition condition;

    B(Condition condition) {
        this.condition = condition;
    }

    @Override
    public void run() {
        Thread thread = currentThread();
        // 只要 condition.running = false 我就停了
        while (condition.running) { // 我只有走到这里时，才直到有人让我退出
            try {
                System.out.println(thread.getId() + ": 挖煤");
                TimeUnit.SECONDS.sleep(10);  // 如果进入到休眠里，有人让我退出，我也是不知道的
            } catch (InterruptedException e) {
            }
        }
    }
}
