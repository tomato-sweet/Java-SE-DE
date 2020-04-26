import java.util.Scanner;

/*

小易经常沉迷于网络游戏.有一次,他在玩一个打怪升级的游戏,他的角色的初始能力值为
a.在接下来的一段时间内,他将会依次遇见n个怪物,每个怪物的防御力为b1,b2,b3...bn.
如果遇到的怪物防御力bi小于等于小易的当前能力值c,那么他就能轻松打败怪物,并
且使得自己的能力值增加bi;如果bi大于c,那他也能打败怪物,但他的能力值只能增加bi 与c的最大公约数.那么问题来了,在一系列的锻炼后,小易的最终能力值为多少?

输入描述:
对于每组数据,第一行是两个整数n(1≤n<100000)表示怪物的数量和a表示小易的初始能力值.
第二行n个整数,b1,b2...bn(1≤bi≤n)表示每个怪物的防御力
输出描述:
对于每组数据,输出一行.每行仅包含一个整数,表示小易的最终能力值
 */
public class Main0426 {
   public static void main(String[] args) {
       System.out.println("输入怪的数量: ");
       Scanner in = new Scanner(System.in);
       int gNum = in.nextInt();
       if(gNum<=0){
           System.out.println("怪物数不能少于0个");
           System.exit(0);
       }
       int[] array = new int[gNum];
       System.out.println("输入小易初始能力值: ");
       int powNum = in.nextInt();
       if(gNum<1||gNum>=100000){
           System.out.println("生命值输入错误");
           System.exit(0);
       }
       System.out.println("输入怪物的能力值:： ");
       for(int i=0;i<gNum;i++){
           array[i] = in.nextInt();
           if(array[i]<=0||array[i]>=10000){
               System.out.println("怪物生命值输入错误");
               System.exit(0);
           }
       }
       for(int i=0;i<gNum;i++){
           powNum = powNum + fight(powNum,array[i]);
       }
       System.out.println("最终生命值为："+ powNum);
       System.exit(0);
   }
   public static int fight(int i, int j){
       if(i>=j) {
           return j;
       }
       else
           return maxYS(i,j);
   }
   public static int maxYS(int i,int j){
       while (i%j != 0) {
           int temp = i%j;
           i = j;
           j = temp;
       }
       return j;
   }
}


