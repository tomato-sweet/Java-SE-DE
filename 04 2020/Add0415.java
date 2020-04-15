/*
请编写一个函数，将两个数字相加。不得使用+或其他算数运算符。
给定两个int A和B。请返回A＋B的值
 */

/*
思路：肯定是用位运算，我记得位运算A^B是不考虑进位的结果，（A&B）<<1是求得的进位
因此A^B+（A&B）<<1的结果就是和，只要（A&B）<<1=0，两项就变成了一项，不需要加法了
 */
public class Add0415 {
     public int addAB(int A, int B) {
         if(B!=0){
             int a=A^B;
             int b=(A&B)<<1;
             return addAB(a,b);
         }else{
             return A;
         }
     }
}
