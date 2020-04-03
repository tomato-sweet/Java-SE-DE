import java.util.HashSet;
import java.util.Scanner;

public class Main040301 {
    public static String deleteMethod(String s,String del){
        HashSet<Character> set = new HashSet<>();
        for (int i = 0;i < del.length(); i++){
            set.add(del.charAt(i));
        }
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0;i < sb.length(); i++){
            if (set.contains(sb.charAt(i))){
                sb.deleteCharAt(i);
                i = i - 1;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String del = sc.next();
        System.out.println(deleteMethod(s,del));
    }
}
