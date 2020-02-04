import java.util.Arrays;

public class ArrayIsReference {
	// 交换不成功的，原因是形参的改变不影响实参
	public static void swap(int a, int b) {
		int t = a;
		a = b;
		b = t;
	}
	
	public static void swap(int[] arr, int i, int j) {
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}
	
	public static void main(String[] args) {
		int[] array = { 9, 13 };
		System.out.println(Arrays.toString(array));
		swap(array, 0, 1);
		System.out.println(Arrays.toString(array));
	}
}


