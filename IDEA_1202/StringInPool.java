public class StringInPool {
    public static void main(String[] args) {
        /*
        String s = "hello";
        String p = "hello";
        String q = "hello";

        //  故意判断引用是否指向同一个对象
        System.out.println(s == p);
        System.out.println(q == p);

        // 判断字符串是否相等
        System.out.println(s.equals(p));
        System.out.println(s.equals(q));
         */


        /*
        String s = "hello";
        String p = new String(s);
        String q = new String(s);

        System.out.println(s.equals(p));
        System.out.println(s.equals(q));

        System.out.println(s == p);
        System.out.println(s == q);
        System.out.println(p == q);
        */

        /*
        String s = "hello" + " " + "world";
        String p = "hello world";
        System.out.println(s == p);
         */
        String s = "hello";
        String p = new String(s);
        p = p.intern();
        System.out.println(s == p);
    }
}
