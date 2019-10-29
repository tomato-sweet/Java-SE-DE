public class HomeWork
{
	public static void main(String[] args)
	{
		if(args.length<2)
		{
			System.out.println("请输入三个数字");
			return;
		}
		int max = 0;
		int min = 0;
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		int z=Integer.parseInt(args[2]);
		// if(x > y)
		// {
			// if(x > z)
			// {
				// System.out.println("三个数中的最大值为：x");
			// }
			// else	
		// }
		// else
		 // System.out.println("三个数中的最小值为：x");
         max = x;
		 if(max < y) {y = max;}
		 if(max < z) {z = max;}
         min = x;
		 if(min > y) {y = min;}
		 if(min > z) {z = min;}

		
		System.out.println("三个数的最大值为：max");
		System.out.println("三个数的最小值为: min");
	}
}