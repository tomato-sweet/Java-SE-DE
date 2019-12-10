/*
public class Example{
    String str = new String("good");
    char[ ] ch = { 'a' , 'b' , 'c' };
    public static void main(String args[]){
        Example ex = new Example();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str + " and ");
        System.out.print(ex.ch);
    }
    public void change(String str,char ch[ ]){
        str = "test ok";
        ch[0] = 'g';
    }
}*/
/*
public class Example{
   public static boolean isAdmin(String userId){
        return userId.toLowerCase()=="admin";
    }
    public static void main(String[] args){
        System.out.println(isAdmin("Admin"));
    }
}*/

    String s1="abc"+"def";//1
    String s2=new String（s1);//2
        if(s1.equals(s2))//3
        System.out.println(".equals succeeded");//4
        if(s1==s2)//5
        System.out.println("==succeeded");//6
