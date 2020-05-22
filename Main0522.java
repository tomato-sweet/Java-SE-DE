import java.util.Scanner;

/*
输入两个字符串，从第一字符串中删除第二个字符串中所有的字符。例如，输入”They are students.”和”aeiou”
则删除之后的第一个字符串变成”Thy r stdnts.”

输入描述:
每个测试输入包含2个字符串

输出描述:
输出删除后的字符串
*/
public class Main0522 {
    public static void main(String[] args){
        Scanner cin=new Scanner(System.in);
        String data=cin.nextLine();
        String target=cin.nextLine();
        StringBuffer buf=new StringBuffer();
        for(int i=0;i<data.length();i++){
            if(!target.contains(data.charAt(i)+""))buf.append(data.charAt(i));
        }
        System.out.println(buf.toString());
    }
}


