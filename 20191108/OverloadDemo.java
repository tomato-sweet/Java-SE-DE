// 不同类允许定义
class OtherOverloadDemo {
	public static int add(int a, int b) {
		return a + b;
	}
}

public class OverloadDemo {
	
	/* 只有返回值不同是不允许定义的
	public static int add(int a, int b) {
		return a + b;
	}
	*/
	
	public static double add(int a, int b) {
		return a + b;
	}
	
	// 重载		Overload
	public static double add(double a, double b) {
		return a + b;
	}
}











