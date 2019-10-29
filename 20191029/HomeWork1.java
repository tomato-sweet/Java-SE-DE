public class HomeWork1
{
	public static void main(String[] args)
	{
		//给定三个Int变量，求其中的最大值和最小值
		int a = 15;
        int b = 40;
        int c = 20;
        int max = 0;
        int min = 0;
        if(a >= b && a >= c)
		{
            max = a;
        }
		else if(b >= a && b >= c)
		{
            max = b;
        }
		else if(c >= a && c >= b)
		{
            max = c;
        }
 
        if(a <= b && a <=  c )
		{
            min = a;
        }else if (b <= a && b <= c)
		{
            min = b;
        }
		else if (c <= a && c <= b)
		{
            min = c;
        }
        System.out.println("max is :" + max);
        System.out.println("min is :" + min);
	}
}