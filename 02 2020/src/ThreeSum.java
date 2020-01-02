
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/*
难度中等1821收藏分享切换为英文关注反馈给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。

 */

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        int len = nums.length;
        if (nums == null || len < 3)
            return  ans;
        Array.sort(nums);  //进行排序
        for (int i =0;i < len;i++){
            if(nums[i] > 0)
                break;
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int L = i + 1;
            int R = len - 1;
            while (L < R){
                int sum = nums[i] + nums[L] + nums[R];
                if (sum == 0){
                    ans.add(Array.asList(nums[i],nums[L],nums[R]));
                    while (L < R && nums[L] == nums[L + 1])
                        L++;
                    while (L < R && nums[R] == nums[R - 1])
                        R--;
                }
                else if (sum < 0)
                    L++;
                else if (sum > 0)
                    R--;
        }
    }
        return ans
}
