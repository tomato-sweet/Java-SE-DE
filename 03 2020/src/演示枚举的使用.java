public class 演示枚举的使用 {
    enum Sex {
        男, 女;
    }

    static class Person {
        String name;
        // 性别
        //int sexInt = 0;
        //String sexString = "男";
        Sex sex = Sex.女;
    }

    public static void main(String[] args) {
        Sex[] values = Sex.values();
        for (Sex sex : values) {
            System.out.println(sex);
        }
    }
}
