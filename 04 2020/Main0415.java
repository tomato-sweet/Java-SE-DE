/*
验证尼科彻斯定理，即：任何一个整数m的立方都可以写成m个连续奇数之和。
例如：
1^3=1
2^3=3+5
3^3=7+9+11
4^3=13+15+17+19

接口说明
原型：

   功能: 验证尼科彻斯定理，即：任何一个整数m的立方都可以写成m个连续奇数之和。
   原型：
   int GetSequeOddNum(int m,char * pcSequeOddNum);
   输入参数：
   int m：整数(取值范围：1～100)
   返回值：
   m个连续奇数(格式：“7+9+11”);


import java.util.Scanner;

public String GetSequeOddNum(int m) {
   //在这里实现功能*
        return null;
         }
 */

import java.util.Scanner;

public class Main0415 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int input = scanner.nextInt();
            scanner.nextLine();
            getString(input);
        }
        scanner.close();
    }

    public static void getString(int input) {
        // first Num format
        int curNum = input * (input - 1) + 1;
        StringBuffer sBuffer = new StringBuffer();
        // build string
        for (int i = 0; i < input; i++) {
            if (i == input - 1) {
                sBuffer.append(curNum);
            } else {
                sBuffer.append(curNum + "+");
            }
            curNum += 2;
        }
        System.out.println(sBuffer);
    }
}