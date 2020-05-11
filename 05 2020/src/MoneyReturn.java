import java.util.Scanner;

/*

考试题目和要点：
1、中文大写金额数字前应标明“人民币”字样。
中文大写金额数字应用壹、贰、叁、肆、伍、陆、柒、捌、玖、拾、佰、仟、万、亿、元、角、分、零、整等字样填写。（30分）
2、中文大写金额数字到“元”为止的，在“元”之后，应写“整字。
如￥ 532.00应写成“人民币伍佰叁拾贰元整”。在”角“和”分“后面不写”整字。（30分）
3、阿拉伯数字中间有“0”时，中文大写要写“零”字，阿拉伯数字中间连续有几个“0”时，中文大写金额中间只写一个“零”字。
如￥6007.14，应写成“人民币陆仟零柒元壹角肆分“。

输入描述:
输入一个double数

输出描述:
输出人民币格式
 */
public class MoneyReturn {
   public static void main(String[] args) {
       final String[] hanzi = { "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖", "拾" };
       Scanner sc = new Scanner(System.in);
       while (sc.hasNext()) {
           double money = sc.nextDouble();
           StringBuffer buffer=new StringBuffer();
           int yi = (int) (money / 100000000);
           int wan = (int) ((money - yi * 100000000) / 10000);
           int ge = (int) (money - yi * 100000000 - wan * 10000);
           System.out.print("人民币");
           if (yi != 0) {
               buffer.append(change(yi)+"亿");
           }
           if (wan != 0) {
               buffer.append(change(wan)+"万");
           }
           if (ge!=0) {
               buffer.append(change(ge)+"元");
           }
           int xiaoshu=(int) ((money - yi * 100000000 - wan * 10000-ge+0.001)*100);
           int jiao=xiaoshu/10;
           int fen=xiaoshu%10;
           if (jiao!=0&&fen!=0) {
               buffer.append(hanzi[jiao]+"角"+hanzi[fen]+"分");
           }else if(jiao!=0&&fen==0){
               buffer.append(hanzi[jiao]+"角");
           }else if (jiao==0&&fen!=0) {
               buffer.append("零"+hanzi[fen]+"分");
           }else if (jiao==0&&fen==0) {
               buffer.append("整");
           }
           String string=buffer.toString();
           System.out.println(string);        }
       sc.close();
   }
   /**     * 4位的汉语转换     *      * @param a     */
   public static String change(int a) {
       final String[] hanzi = { "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖", "拾" };
       int qian = a / 1000;
       int bai = (a - qian * 1000) / 100;
       int shi = (a - qian * 1000 - bai * 100) / 10;
       int ge = a - qian * 1000 - bai * 100 - shi * 10;
       StringBuffer br = new StringBuffer();
       if (qian != 0) {
           br.append(hanzi[qian] + "仟");
       }        if (bai != 0) {
           br.append(hanzi[bai] + "佰");
       } else if (qian != 0 && bai == 0 && (shi != 0 || ge != 0)) {
           br.append("零");        }
       if (shi != 0&&shi!=1) {
           br.append(hanzi[shi] + "拾");
       } else if (bai != 0 && ge != 0) {
           br.append("零");
       }
       if(shi==1&&qian==0&&bai==0){
           br.append("拾");
       }
       if (ge != 0) {
           br.append(hanzi[ge]);
       }
       String s=br.toString();
       return s;
   }
}
