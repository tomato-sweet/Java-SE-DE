import java.util.Scanner;
/*
今年公司年会的奖品特别给力，但获奖的规矩却很奇葩：
 1. 首先，所有人员都将一张写有自己名字的字条放入抽奖箱中；
 2. 待所有字条加入完毕，每人从箱中取一个字条；
 3. 如果抽到的字条上写的就是自己的名字，那么“恭喜你，中奖了！”
 现在告诉你参加晚会的人数，请你计算有多少概率会出现无人获奖？
 */

public class Main0509 {
    public static void main(String[] args) {
        // 输入
         Scanner sc = new Scanner(System.in);
         while(sc.hasNext()){
             int n = sc.nextInt();
             // 代表测试数据的组数
             float sum1 = factorial(n);
             float sum2 = count(n);
             //将得到的分子分母进行相除，就可以得到概率了。
             float result1 = (sum2/sum1)*100;
             System.out.println(String.format("%.2f", result1) + "%");
         }
    }
    //错排
    public static float count(int n) {
        if(n==1){
            return 0;
        }else if(n==2){
            return 1;
        }else{
            return (n-1)*(count(n-1)+count(n-2));
        }
    }
    // n的阶乘
public static float factorial(int num) {
        float result = 1;
        if(num==0){
            return 1;
        }else if (num > 0) {
            result = num * factorial(num - 1);
        }
        return result;
    }
}