import java.util.Arrays;

/*  n%2 = 1 奇数
    n%2 = 0 偶数
 */
public class ParitySorting {
        public int[] sortArrayByParity(int[] A) {
            Integer[] B = new Integer[A.length];
            for (int t = 0; t < A.length; ++t)
                B[t] = A[t];

            Arrays.sort(B, (a, b) -> Integer.compare(a%2, b%2));
            for (int t = 0; t < A.length; ++t)
                A[t] = B[t];
            return A;
        }
}
