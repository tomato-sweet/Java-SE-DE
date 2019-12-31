/*
给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
你可以假设数组是非空的，并且给定的数组总是存在多数元素。
。
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int majorityCount = nums.length/2;
        for (int num : nums){
            int count = 0;
            for (int elem : nums){
                if (elem == num){
                    count += 1;
                }
            }
            if (count > majorityCount){
                return num;
            }
        }
        return -1;
    }
}
