/*
北京大学对本科生的成绩施行平均学分绩点制（GPA）。既将学生的实际考分根据不同的学科的不同学分按一定的公式进行计算。
公式如下：
实际成绩 绩点
90——100 4.0
85——89 3.7
82——84 3.3
78——81 3.0
75——77 2.7
72——74 2.3
68——71 2.0
64——67 1.5
60——63 1.0
60以下 0
1．一门课程的学分绩点=该课绩点*该课学分
2．总评绩点=所有学科绩点之和/所有课程学分之和
现要求你编写程序求出某人A的总评绩点（GPA）。


输入描述:
第一行 总的课程数n（n<10）；
第二行 相应课程的学分（两个学分间用空格隔开）；
第三行 对应课程的实际得分；
此处输入的所有数字均为整数。

输出描述:
输出有一行，总评绩点，精确到小数点后2位小数。（printf("%.2f",GPA);）
 */
import java.util.Scanner;

public class Main0427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt(); //输入总共有多少门课程
            int[] gradeCredit=new int[n];//存储每门课学分的数组
            int[] grade=new int[n];//存储每门课分数的数组

            for(int i=0;i<n;i++){
                gradeCredit[i]=sc.nextInt(); //读入输入的第二行
            }
            for(int i=0;i<n;i++){
                grade[i]=sc.nextInt();//读入输入的第三行
            }
            System.out.printf("%.2f",averageCredit(gradeCredit,grade));
        }
    }
    public static double averageCredit(int[] gradeCredit,int[] grade){
        double sum=0.0;//表示所有课程加起来应得的学分和
        double allClassCredit=0.0; //表示该学生能实际得到的学分绩点
        for(int i=0;i<grade.length;i++){
            allClassCredit+=gradeCredit[i]*GPA(grade[i]);
            sum+=gradeCredit[i];
        }
        return allClassCredit/sum;
    }
    //求每门课的成绩对应的学分绩点
    public static double GPA(int grade){
        double gpa = 0.0;
        if(grade>=90&&grade<=100)
            gpa=4.0;

        if(grade>=85&&grade<=89)
            gpa=3.7;

        if(grade>=82&&grade<=84)
            gpa=3.3;

        if(grade>=78&&grade<=81)
            gpa=3.0;

        if(grade>=75&&grade<=77)
            gpa=2.7;

        if(grade>=72&&grade<=74)
            gpa=2.3;

        if(grade>=68&&grade<=71)
            gpa=2.0;

        if(grade>=64&&grade<=67)
            gpa=1.5;

        if(grade>=60&&grade<=63)
            gpa=1.0;

        if(grade<60)
            gpa=0.0;

        return gpa;
    }
}

