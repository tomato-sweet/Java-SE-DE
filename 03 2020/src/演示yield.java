public class 演示yield {
    private static class 其他线程 extends Thread {
        @Override
        public void run() {
            while (true) {
                System.out.println("其他");
            }
        }
    }

    public static void main(String[] args) {
        Thread t = new 其他线程();
        t.start();

        while (true) {
            System.out.println("你好");
            Thread.yield();
        }
    }
}
