import java.util.List;

public class TreeDemo {
    def subsets(self, nums: List[int]) -> List[List[int]]:
    res = []
            for i in range(len(nums)+1):
            for tmp in itertools.combinations(nums, i):
            res.append(tmp)
            return res

}
