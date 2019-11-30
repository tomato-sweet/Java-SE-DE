import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        map.put("姓名","黎洁");
        map.put("性别","女");
        map.put("年龄","-");
        map.get("年级");
        System.out.println(map.getOrDefault("年级","17"));
        System.out.println(map.containsKey("年级"));
        System.out.println(map.containsValue("17"));
        for (Map.Entry<String,String>entry : map.entrySet())
        {
            System.out.println(entry.getKey()
            +"||"+entry.getValue());
        }
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        map.put("身高","163");
        map.put("年龄","20");
        for (Map.Entry<String,String>entry : map.entrySet())
        {
            System.out.println(entry.getKey()
                    +"||"+entry.getValue());
        }
    }
}
