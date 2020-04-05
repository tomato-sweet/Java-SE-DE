/*
二货小易有一个W*H的网格盒子，网格的行编号为0~H-1，网格的列编号为0~W-1，每个格子至多可以放一块蛋糕，任意两块蛋糕的欧几里得距离不能等于2。
对于两个格子坐标（X1,Y1）,（X2,Y2）的欧几里的距离为：((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)的算术平方根。
小易想知道最多可以放多少块蛋糕在网格盒子里。
 */

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int col = in.nextInt();
        int row = in.nextInt();
        int[][] grid = new int[row][col];
        for (int i = 0;i < row;i++){
            if(i % 4 ==0 || i % 4 ==1) {
                for (int j = 0; j < col; j++) {
                    if (j % 4 == 0 || j % 4 == 1) {
                        grid[i][j] = 1;
                    }
                }
            }else {
                for (int j = 0;j < col;j++){
                    if (j % 4 ==2 || j % 4 == 3){
                        grid[i][j] = 1;
                    }
                }
            }
        }
        int count = 0;
        for (int x = 0;x < row;x++){
            for (int y = 0;y < col;y++){
                if (grid[x][y] == 1){
                    count ++;
                }
            }
        }
        System.out.println(count);
    }
}
