/*
给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 */
public class StrDemo {
    int search(String pat, String txt) {
        int M = pat.length;
        int N = txt.length;
        for (int i = 0; i < N - M; i++) {
            int j;
            for (j = 0; j < M; j++) {
                if (pat[j] != txt[i+j])
                    break;
            }
            if (j == M) return i;
        }
        // txt 中不存在 pat 子串
        return -1;
    }
}

