/*
正整数A和正整数B 的最小公倍数是指 能被A和B整除的最小的正整数值，设计一个算法，求输入A和B的最小公倍数。
 */

import java.util.Scanner;

public class Leastcommon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = min(a,b);
        int n =a * b / m;
        System.out.println(n);
    }
    public static int min(int a,int b){
        if(a < b){
            int t = a;
            a = b;
            b = t;
        }
        while (b != 0){
            if (a == b){
                return a;
            }else {
                int k = a % b;
                a = b;
                b = k;
            }
        }
        return a;
    }
}
