import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


public class CollectionDemo {
    public static void main(String[] args){
        Collection<String> list = new ArrayList<>();
        list.add("周周");
        list.add("是猪");
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        Object[] array = list.toArray();
        System.out.println(Arrays.toString(array));
        list.remove("是猪");
        System.out.println(list.size());
        list.clear();
        System.out.println(list.isEmpty());
    }
}
