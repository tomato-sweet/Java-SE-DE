public class XunHuan{
	public static void main(String[] args) {
		//1!+2!+3!+4!+5!
		// 把大问题分解成小问题
		// 1. 写代码求阶乘
		// 2. 写代码分别输出 1，2，3，4，5 的阶乘
		// 3. 求出和
		/*
		int sum = 0;
		int n = 5;
		int i = 1;
		while (i <= n) {
			int factor = 1;
			int j = 1;
			while (j <= i) {
				factor *= j;
				j++;
			}
			sum += factor;
			i++;
		}		
		System.out.println(sum);
		*/
		
		//int n = 10;
		/*
		do {
			n++;
		} while (n < 10);
		*/
		
		/*
		while (n < 10) {
			n++;
		}
		*/
		
		//System.out.println(n);	//	10
		
		/*
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		// System.out.println(i);	作用域
		*/
		
		
		int[] a = { 1, 2, 3, 4, 5, 6 };
		// 找到数组中 n 所在的下标
		int n = 3;
		int index = -1;
		for (int i = 0; i < a.length; i++) {
			
			System.out.println("检查之前");
			if (a[i] == n) {
				index = i;
				continue;
			}
			System.out.println("检查之后");
		}
		System.out.println(index);
	}
}





















