/*
成绩排序
查找和排序
题目：输入任意（用户，成绩）序列，可以获得成绩从高到低或从低到高的排列,相同成绩
都按先录入排列在前的规则处理。
 */

import java.util.*;

public class Main0421{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            int numPeople=scanner.nextInt();
            int option=scanner.nextInt();
            List<Student> stuList=new ArrayList<Student>();
            for(int i = 0; i<numPeople; i++){
                stuList.add(new Student(scanner.next(), scanner.nextInt()));
            }
            //降序
            if(option==0){
                Collections.sort(stuList, new Comparator<Student>(){
                    public int compare(Student o1,Student o2){
                        return o2.score-o1.score;
                    }
                });
            }else if(option==1){
                //升序
                Collections.sort(stuList, new Comparator<Student>(){
                    public int compare(Student o1,Student o2){
                        return o1.score-o2.score;
                    }
                });
            }for(int i=0;i<stuList.size();i++){
                System.out.println(stuList.get(i).name+" "+stuList.get(i).score);
            }
        }
    }
}
class Student{
    public String name;
    public int score;
    public Student(String name,int score){
        this.name=name;
        this.score=score;
    }
}

