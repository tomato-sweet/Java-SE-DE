import java.util.Scanner;

/*
在一个坏掉的键盘上，有些键已经磨损了。所以当你输入一些句子，一些人物对应的按键不会出现在屏幕上。
现在给定一个你要输入的字符串，这个字符串你真的打出来了，请列出哪些键它们肯定是磨损了。
 */
public class Main0514 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        String originalString = input.nextLine();
        String typedOutString = input.nextLine();
        int[] keyboard = new int[128];
        // 扫描已键入的字符串，将小写字母转换成大写字母，使用 ASCII 码与 keyboard 对应，将成功键入的字符位置为 1
        for (int i = 0; i < typedOutString.length(); i++) {
            char ch = Character.toUpperCase(typedOutString.charAt(i));
            keyboard[ch] = 1;
        }
        // 扫描原始字符串，将小写字母转换成大小字母，去 keyboard 中检查是否已被成功键入，如果未成功键入，则打印对应的大写字母
        // 并将 keyboard 中的对应的字符位置为 -1，表明已被打印
        for (int i = 0; i < originalString.length(); i++) {
            char ch = Character.toUpperCase(originalString.charAt(i));
            if (keyboard[ch] == 0) {
                System.out.print(ch);
                keyboard[ch] = -1;
            }
        }
        input.close();
    }
}


