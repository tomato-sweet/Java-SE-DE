import java.util.ArrayList;
import java.util.List;

public class ArraylistDemo {
    public static void main(String[] args) {
        List<String> courses = new ArrayList<>();
        courses.add("C 语言");
        courses.add("Java SE");
        courses.add("Java DE");
        System.out.println(courses);
        courses.set(0, "计算机基础");
        System.out.println(courses);
        List<String> subCourses = courses.subList(1, 3);
        System.out.println(subCourses);
    }
}
