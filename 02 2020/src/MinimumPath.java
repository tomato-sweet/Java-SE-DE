import java.util.List;

public class MinimumPath {
    public int minimumTotal(List<List<Integer>> triangle) {

        int size = triangle.size();
        int[] dp = new int[size];

        List<Integer> last = triangle.get(size - 1);
        for (int i = 0; i < size; i++)
            dp[i] = last.get(i);


        for (int i = size-2; i >= 0; i--) {
            List<Integer> list = triangle.get(i);
            for (int j = 0; j < i+1; j++) {
                dp[j] = list.get(j) + Math.min(dp[j], dp[j+1]);
            }
        }

        return dp[0];
    }
}
