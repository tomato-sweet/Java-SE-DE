import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedlistDemo {
    public static void main(String[] args) {
        List<String> courses = new ArrayList<>();
        courses.add("C 语言");
        courses.add("123");
        courses.add("Java DE");
        courses.add("456");
        courses.add("789");
        List<String> courses3 = new LinkedList<>(courses);
        System.out.println(courses3);
        ArrayList<String> courses4 = (ArrayList<String>)courses3;
        System.out.println(courses4);
        LinkedList<String> courses5 = (LinkedList<String>)courses3;
        System.out.println(courses5);

    }
}
