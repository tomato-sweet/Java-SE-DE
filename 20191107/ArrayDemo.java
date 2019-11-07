public class ArrayDemo{
	
	/* public static int[] creatArray(int n){
		//运行使用变量作为数组的长度
		return new int[n];
	}
	public static void printArray(int[] a){
		//获取数组的长度
		int size=a.length;
		for(int i = 0;i < size;i++){
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args){
		int[] a = creatArray(5);
		printArray(a);
	} */
	
	
	public static void main(String[] args){
		int[] a={1,2,3};
		printArray(a);
	}
	
	//给定数组，计算数组的最大值；返回最大值 int[] 返回int max;
	/* public static int max(int[] a){
		int max=Integer.MIN_VALUE;  //int max=a[0];
		for(int v:a){     // for(int i=0;i<a.length;i++)
			if(v>max)     //if(a[i]>max)
				max=v;    //max=a[i];
				return a[i];
		}
	}	
	return max; */

	//给定数组，计算数组平均值，返回double,average
	 public static double average(int[] a) {
		int sum = 0;
		for (int v : a) {
			sum += v;
		}
		return (double)sum / a.length;
	}
	
} 
















