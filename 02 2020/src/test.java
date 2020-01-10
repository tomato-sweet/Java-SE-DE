public class test{
    String str = new String("hello");
    char[] ch ={'a','b'};
    public static void main(String args[]){
        Example ex = new Example();
        ex.change(ex.str,ex.ch);
        System.out.println(ex.str);
    }
}