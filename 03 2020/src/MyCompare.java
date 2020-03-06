import java.util.Arrays;
import java.util.Comparator;

//自定义类型 去实现 Comparable接口的compareTo方法， 就可以进行大小的比较
// 自然顺序
class Person implements  Comparable<Person>{
    int age;
    String name;

    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;

        if(obj == null || !(obj instanceof Person))
            return false;

        Person p = (Person) obj;
        return age == p.age && name.equals(p.name);

    }
    /*
    compareTo:
       返回值 < 0:  表示当前对象小于被比较的对象
       返回值 = 0： 表示两个对象相等
       返回值 > 0:  表示当前对象大于被比较的对象
     */
    @Override
    public int compareTo(Person o) {
        return age - o.age;
    }

    @Override
    public String toString() {
        return name + "-->" + age;
    }
}

// 2 可以实现一个自定义类型的比较器, 比较器去实现Comparator的compare方法， 自定义也可以进行大小比较
// 非自然顺序: 也可以称为自定义顺序
class PersonAgeComparator implements Comparator<Person>{
    /*
    compare:
       返回值 < 0:  表示当前对象小于被比较的对象
       返回值 = 0： 表示两个对象相等
       返回值 > 0:  表示当前对象大于被比较的对象
     */
    @Override
    public int compare(Person o1, Person o2) {
        return o1.age - o2.age;
    }
}

class PersonNameComparator implements  Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        //String : 按字典序
        return o1.name.compareTo(o2.name);
    }
}

public class MyCompare {

    public static void swap(Person[] arr, int left, int right){
        Person tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
    }
    public static void bubbleSort(Person[] arr){
        int end = arr.length;
        while(end > 0){
            boolean flag = true;
            for(int i = 1; i < end; ++i){
                if(arr[i - 1].compareTo(arr[i]) > 0){
                    swap(arr, i - 1, i);
                    flag = false;
                }
            }
            if(flag)
                break;
            --end;
        }
    }

    public static void bubbleSort(Person[] arr, Comparator<Person> comparator){
        int end = arr.length;
        while(end > 0){
            boolean flag = true;
            for(int i = 1; i < end; ++i){
                if(comparator.compare(arr[i - 1],arr[i]) > 0){
                    swap(arr, i - 1, i);
                    flag = false;
                }
            }
            if(flag)
                break;
            --end;
        }
    }

    public static void test1()
    {
        Person[] arr = {new Person(20, "wangjiwen"), new Person(19, "zhaojunjie"), new Person(37, "chenlaoshi")};
        Person[] copy = arr.clone();
        //排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, new PersonAgeComparator());
        System.out.println("Arrays.sort: " + Arrays.toString(arr));
        Arrays.sort(arr, new PersonNameComparator());
        System.out.println(Arrays.toString(arr));
        bubbleSort(copy);
        System.out.println("bubbleSort Age: " + Arrays.toString(copy));
        bubbleSort(copy, new PersonNameComparator());
        System.out.println("bubbleSort name: " + Arrays.toString(copy));

    }

    public static void test2()
    {
        Person p1 = new Person(35, "陈老师");
        Person p2 = new Person(35, "陈老师");
        // == : 比较引用指向是否相同
        System.out.println(p1 == p2);
        // equals: 比较内容是否相同
        System.out.println(p1.equals(p2));

    }

    public static void main(String[] args) {
        //test1();
        test2();
    }
}