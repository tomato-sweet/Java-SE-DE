import java.math.BigInteger;
import java.util.Scanner;
//请设计一个算法完成两个超长正整数的加法。

/* 请设计一个算法完成两个超长正整数的加法。 输入参数： String addend：加数 String augend：被加数 返回值：加法结果 */
public class Main0414{
    public String AddLongInteger(String addend, String augend) {
        /*在这里实现功能*/
        BigInteger a = new BigInteger("0");
        BigInteger bigInteger = new BigInteger(addend);
        BigInteger bigInteger1 = new BigInteger(augend);
        if(bigInteger.compareTo(a)>0&&bigInteger1.compareTo(a)>0) {
            bigInteger = bigInteger.add(bigInteger1);
            String str = String.valueOf(bigInteger);
            return str;
        }
        return null;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        while(sc.hasNext()) {
            String addend = sc.nextLine();
            String augend = sc.nextLine();
            System.out.println(AddLongInteger(addend, augend));
        }
    }
}