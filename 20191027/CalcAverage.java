public class CalcAverage{
	public static void main(String[] args){
		if(args.length==0){
		System.out.println("至少输入一个数");
		}
		int sum = 0;//求和
		for(int i = 0;i<args.length;i++){
			sum += Integer.parseInt(args[i]); //将args[i]的类型强转为int类
		}
		//求平均值
		double average= 1.0*sum/args.length; //将sum的类型转为double
		System.out.println("他们的平均值是:"+average);
		
	}
}