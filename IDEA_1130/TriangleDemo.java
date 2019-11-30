import java.util.ArrayList;
import java.util.List;

public class TriangleDemo {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        //每一行 triangle[i][0],triangle[i][i];
        //中间元素 triangle[i][j] = triangle[i-1][j-1]+triangle[i-1][j]
        for(int i = 0;i < numRows;++i) {
            triangle.add(new ArrayList<>());
            triangle.get(i).add(i);
        }
        for(int i = 1;i < numRows;++i){
            for (int j = 1;j < i;++j) {
                int ret = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                triangle.get(i).add(ret);
            }
            triangle.get(i).add(1);
            }
        return triangle;
        }
    }
