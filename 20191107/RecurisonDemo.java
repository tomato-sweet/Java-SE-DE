public class RecurisonDemo{
	
	public static void printNumeber(int n){
	if(n < 10){
		System.out.printf("%d ",n);
	}else{
		int m = n / 10;
		printNumeber(m);
		int o = n % 10;
		System.out.printf("%d ",n);
	}
	}
	
	//输入一个整数，返回组成他的数字之和
	public static int sumNumeber(int n){
		if(n<10){
		  return n;
		}else{
			//19 1+9=10
			//先输出1和9，再相加
			/* sum = (num%10)+(num/10);
			System.out.println("%d",sum); */
			int m = n/10;
			int o = n%10;
			int h=sumNumeber(m);
			int r=h+o;
			return r;
		}
	}
	public static void main(String[] args){
		System.out.println(sumNumeber(9527));
	}
	
}


















