package 使用自定义的标志通知停止;

// 需要让 main 修改的值，B 线程能看到
// 让 main 和 B 线程拥有执行同一个对象的引用即可
// @main 修改 condition.running = false
// @B    能看到这个修改
public class Condition {
    // volatile 以后会将，现在不用管
    public volatile boolean running = true;
}
