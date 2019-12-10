public class ExampleDemo {
    public static void main(String args[]){
    String str1 = "hello";
    String str2 = "happy";
    System.out.println(str1.equals(str2));
    System.out.println("AD".compareTo("DE"));
    System.out.println(str1.contains("lo"));
    System.out.println(str2.indexOf("y"));
    System.out.println(str1.replaceAll("l","k"));
    String str3 = "say hello to the world";
    String[] result = str3.split("0",4);
    for (String s : result){
        System.out.println(s);
    }
    }
}
