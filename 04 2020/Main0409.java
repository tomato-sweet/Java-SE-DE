import java.util.Scanner;

/*
输入一个整数，将这个整数以字符串的形式逆序输出
程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
 */
public class Main0409 {
    public static void main(String[] arg) {
        int b;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            System.out.println(reverseNum1(n));
            System.out.println(reverseNum2(n));
            System.out.println(reverseNum3(n));
        }
    }
    public static StringBuilder reverseNum1(int a) {
        // 方法1
        StringBuilder sb = new StringBuilder(a + "");// 将a转换成字符串
        sb.reverse();
        return sb;
    }
    public static String reverseNum2(int a) {
        // 方法2:取整数，转换成字符串，再把每个字符存入StringBuilder中，最后转换成字符串输出
        String s = String.valueOf(a);
        StringBuilder sbBuilder = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sbBuilder.append(s.charAt(i));
        }
        return sbBuilder.toString();
    }
    public static String reverseNum3(int a) {
        // 方法3
        String s = "";
        while (a != 0) {
            int n = a % 10;
            s = s + n;
            a /= 10;
        }
        return s;
    }
}
