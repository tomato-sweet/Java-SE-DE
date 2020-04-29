/*
输入一个数n，然后输入n个数值各不相同，再输入一个值x，输出这个值在这个数组中的下标（从0开始，若不在数组中则输出-1）。

输入描述:
测试数据有多组，输入n(1<=n<=200)，接着输入n个数，然后输入x。

输出描述:
对于每组输入,请输出结果。
 */


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main0429 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            Map<Integer,Integer> map =new HashMap<>(n);
            for(int i=0;i<n;i++){
                map.put(sc.nextInt(),i);
            }
            int x=sc.nextInt();
            if(map.containsKey(x)){
                System.out.println(map.get(x));
            }else {
                System.out.println(-1);
            }
        }
    }
}


