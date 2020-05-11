import java.util.Scanner;

/*
        输入一个字符串，然后对每个字符进行奇校验，最后输出校验后的二进制数(如'3’，输出：10110011)。

        输入描述:
        输入包括一个字符串，字符串长度不超过100。

        输出描述:
        可能有多组测试数据，对于每组数据，
        对于字符串中的每一个字符，输出按题目进行奇偶校验后的数，每个字符校验的结果占一行。

思路：
1.字符--->整数
2.判断二进制整数中 1 的个数：让其每一位与对应的位数为1的数字相与，如果为1则计数器+1
3.判断计数器值是否为偶数，为偶数则最高位（第八位）置1，完成奇校验
4.整数换为二进制输出（字符串拼接）
 */

public class Main0511{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()) {
            String s=in.nextLine();
            for (int i=0;i<s.length();i++){
                int ch=s.charAt(i);
                if (c(ch)%2==0){ //若1的个数为偶数
                                 ch+=128;
                }
                System.out.println(num(ch));
            }
        }
    }
    public static int c(int n){//判断二进制整数中 1 的个数
                       int count=0;
                       int b=1;
                       for (int i=0;i<8;i++){
                           if ((n & b)==b){
                               count++;
                           }
                           b=(b<<1);
                       }return count;
    }
    public static String num(int n){//整数换为二进制输出
                       int b=128;
                       StringBuilder string=new StringBuilder();
                       for (int i=0;i<8;i++){
                           if ((n & b)==b){
                               string.append("1");
                           }else{
                               string.append("0");
                           }
                           b=(b>>>1);
                       }return string.toString();
    }
}