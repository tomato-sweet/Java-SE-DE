/*

请编写一个方法，将字符串中的空格全部替换为“%20”。假定该字符串有足够的空间存放新增的字符，并且知道字符串的真实长度
(小于等于1000)，同时保证字符串由大小写的英文字母组成。
给定一个string iniString 为原始的串，以及串的长度 int len, 返回替换后的string。
 */
public class Main0520 {
    public String replaceSpace(String iniString, int length) {
        if(iniString==null||"".equals(iniString)||length<=0||iniString.length()!=length) return iniString;
        StringBuffer str=new StringBuffer(iniString);
        str.insert(0,'#');
        str.append('#');
        String[] value=str.toString().split(" ");
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<value.length;i++){
            sb.append(value[i]);
            if(i==value.length-1) break;
            else sb.append("%20");
        }
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}

