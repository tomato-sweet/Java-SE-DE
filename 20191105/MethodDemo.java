 public class MethodDemo{
	/*	
		//计算两个double类型的减法，并打印返回结果
		//两个参数 参数类型为double 返回值为double 方法名称叫sub
	public static double sub(double a,double b){
		double r = a - b;
		//a,b形参
		//方法如何把结果传递出去
		return r;
	}
	public static void main(String[] args){
		double a = 1;
		double b = 3;
		double r = sub(a,b);
		//a,b实参
		System.out.println(r);
	}
	*/
	
	/*
	//交换两个变量的值
	public static void main(String[] args){
	int a = 10;
    int b = 14;
	swap(a,b);
    System.out.println("a = " + a);
	System.out.println("b = " + b);
}
	public static void swap(int a,int b){
		int t = a;
		a = b;
		b = t;
	}
    */
	
	//1!+2!+3!+4!+5!
	//求阶乘
	// public static int factorial(int n){
		// int factor = 1;
		// for(int = i;i <= n;i++){
			// factpr *=1;
		// }
		// return factor;
	// }
	//求1到n的阶乘的和的方法
	// public static int sum(int n){
		// int sum = 0;	//方法名称可以和变量名称相同
		// for(int i = 0;i <= n;i++){
			// sum +=factorial(i);
		// }
		// return sum;
	// }
	
	// 1! + 2! + 3! + 4! + 5!
	// 1. 求阶乘的方法
	public static int main(String[] args){
		public static int factorial(int n) {
			int factor = 1;
			for (int i = 1; i <= n; i++) {
				factor *= i;
			}
			
			return factor;
		}
		
		// 2. 求1到n的阶乘的和的方法
		public static int sum(int n) {
			if (n <= 1) {
				return -1;
			}	
			int sum = 0;
			for (int i = 1; i <= n; i++) {
				sum += factorial(i);
			}
			return sum;
		}
	}
 }


























