public class HomeWork14{
	public static void main(String[] args){
		//打印年龄段 低于18是少年，19-28是青年，29-55是中年，56以上是老年
		
		int age=Integer.parseInt(args[0]);
		if(age > 0 && age <18){
			System.out.println(age+"是少年");
		}else if(age > 18 && age <29){
		System.out.println(age+"是青年");
		}else{
			if(age > 28 && age <56){
			System.out.println(age+"是中年");
			}else{
			if(age > 56){
			System.out.println(age+"是老年");
				}
			}
		}
		
		
		//判定一个数字是否为素数
		//根据定义直接判断从2到n-1是否存在n的约数即可
		/*Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		boolean isPrime = true;
		if(n == 1){
			isPrime = false;
		}
		for(int  i = 2;i < n; i++){
			if(n%i ==0){
				isPrime = false;
				break;
			}
		}
		if(isPrime){
			System.out.println(n+"是素数");
		}else{
			System.out.println(n+"不是素数");
		}
		*/
		
		//打印1000-2000之间所有的闰年
		/*
		int year;
        for(year = 1000;year < 2001;year++){
            if((year%400==0)||(year%4==0&&year%100!=0)){
                System.out.printf("%d ",year);
            }
        }
		*/
		
		
		// 打印1-100之间的所有素数
		// int i, j;
          // for (i = 2; i <= 100; i++) {
              // for (j = 2; j < i; j++) {
                 // if (i % j == 0)
                     // break;
            // }
            // if (j >= i)
                // System.out.println(i);
		// }
	}
}

————————————————






























