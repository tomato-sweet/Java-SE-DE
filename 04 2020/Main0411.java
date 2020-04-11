import java.util.Scanner;

public class Main0411{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int[] a = new int[10];
        if (s == "0") {
            System.out.println("0:1");
        } else {
            for (int i = 0; i < s.length(); i++) {
                a[Integer.parseInt(s.charAt(i)+"")]++;
            }
            for (int i = 0; i < 10; i++) {
                if (a[i] > 0) {
                    System.out.println(i + ":" + a[i]);
                }
            }
        }
    }
}