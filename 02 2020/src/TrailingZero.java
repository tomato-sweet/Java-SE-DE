/*
给定一个整数 n，返回 n! 结果尾数中零的数量。
注意：找 2*5 ，2 和 5 的个数决定有几个0
 */

//超出时间限制
/*
public class TrailingZero {
    public int trailingZeroes(int n) {
        int count = 0;
        for (int i = 1;i <= n;i++){
            int N = i;
            while (N > 0){
                if (N % 5 == 0){
                    count ++;
                    N /= 5;
                }else {
                    break;
                }
            }
        }
        return count;
    }
}
*/

class Solution {
    public int trailingZeroes(int n) {
        int c = (int)(Math.log(n) / Math.log(5));
        int ans = 0;
        for (int i = 1; i <= c; i++) {
            int d = (int)(Math.pow(5,i));
            ans += n / d;
        };
        return ans;
    }
}


