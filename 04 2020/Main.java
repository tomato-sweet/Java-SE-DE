import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            //str接收输入的字符串
            String str = sc.nextLine();
            //判断str的合法性
            if(str.length() == 0 || str == null || str.length() > 255){
                throw new UnsupportedOperationException("输入的字符串不合法！");
            }
            StringBuffer sb = new StringBuffer();
            for (char ch:str.toCharArray()) {
                //如果字符范围是在['0','9']，利用append方法将其加入到sb中
                if(ch >= '0' && ch <= '9'){
                    sb.append(ch);
                }else{
                    //如果不是数字字符，将空格加入到sb中
                    sb.append(" ");
                }
            }
            //将sb转为字符串
            String str1 = sb.toString();

//            //定义一个str1用以保存更改后的字符串
//            String str1 = "";
//            for (char ch:str.toCharArray()) {
//                //如果字符范围是在['0','9']，那么直接追加到str1中
//                if(ch >= '0' && ch <= '9'){
//                    str1 += ch;
//                }else{
//                    //如果不是数字字符，将其变为空格，追加到str1中
//                    str1 += " ";
//                }
//            }

            //将str1以一个或者多个空格进行切割，存入到nums中
            String[] nums = str1.split("\\s+");
            //maxSize存放最长连续数字串的长度
            int maxSize = 0;
            for (int i = 0; i < nums.length; i++) {
                //如果String数组中的任意一个变量的长度大于maxSize,则更新maxSize的值
                maxSize = nums[i].length() > maxSize ? nums[i].length() : maxSize;
            }
            for (int i = 0; i < nums.length; i++) {
                //如果变量长度等于最大长度（连续数字串的长度），则进行输出（变量长度相等时，都进行输出）
                if(maxSize == nums[i].length()){
                    //打印变量后，以逗号进行分割
                    System.out.print(nums[i] + ",");
                }
            }
            //打印变量的长度
            System.out.println(maxSize);
        }
    }
}

