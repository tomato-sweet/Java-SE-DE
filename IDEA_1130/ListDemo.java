import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> courses = new ArrayList<>();
        courses.add("西安工业大学");
        courses.add("党委宣传部");
        courses.add("广播台");
        //重复元素
        courses.add("广播台");
        System.out.println(courses); //西安工业大学 党委宣传部 广播台 广播台
        System.out.println(courses.get(1)); //党委宣传部
        System.out.println(courses.get(2));//广播台
        //截取部分 0-1的部分
        List<String> subCourses = courses.subList(0, 1); //西安工业大学
        System.out.println(subCourses);
        courses.remove("广播台");//西安工业大学 党委宣传部  广播台
        courses.set(2,"西安工业大学");//把下标为2的元素广播台，改为西安工业大学
        System.out.println(courses);
        courses.clear();
    }
}
