import java.util.ArrayList;
import java.util.List;

/*
先把 j 加上 k，变为 (i,j+k)。
当 j >= m 时，j -= m, i +=1，直到 j < m。
当 i >= n 时，i -= n。
 */
class GridDemo {
    //先输入一个 n 行 m 列的二维网格 grid 和一个整数 k
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int[] nums = new int[grid.length * grid[0].length];
        for (int i = 0, iMax = grid.length; i < iMax; i++) {
            for (int j = 0, jMax = grid[0].length; j < jMax; j++) {
                k %= nums.length;
                nums[k++] = grid[i][j];
            }
        }
        k = 0;
        List<List<Integer>> lists = new ArrayList<>(grid.length);
        for (int i = 0, iMax = grid.length; i < iMax; i++) {
            List<Integer> tempList = new ArrayList<>(grid[0].length);
            for (int j = 0, jMax = grid[0].length; j < jMax; j++) {
                tempList.add(nums[k++]);
            }
            lists.add(tempList);
        }
        return lists;
    }
}