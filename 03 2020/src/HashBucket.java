public class HashBucket {
    private static class Node{
        int key;
        int value;
        Node next = null;
        public Node(int key, int value)
        {
            this.key  = key;
            this.value = value;
            next = null;
        }
    }

    private Node[] array;
    private int size;
    private static final double LOAD_FACTORY = 0.7;

    public HashBucket()
    {
        array = new Node[2];
        size = 0;
    }

    //负载因子
    public double loadFactory(){
        return size * 1.0 / array.length;
    }

    public int put(int key, int value){
        //检查容量
        if(loadFactory() >= LOAD_FACTORY){
            //增容
            resize();
        }
        //插入
        // 1. 计算哈希值
        int idx = key % array.length;
        // 2. 不能插入重复的key, 首先要查看key是否已经存在, 遍历当前位置的单链表
        Node cur = array[idx];
        while(cur != null){
            if(cur.key == key){
                int oldV = cur.value;
                cur.value = value;
                return oldV;
            }
            cur = cur.next;
        }
        // 3. 插入： 单链表的头插
        cur = new Node(key, value);
        cur.next = array[idx];
        array[idx] = cur;

        ++size;
        return -1;
    }
    public void resize()
    {
        Node[] newArray = new Node[array.length * 2];
        //元素搬移
        // 遍历旧表
        for(int i = 0; i < array.length; ++i){
            Node curHead = array[i];
            while(curHead != null){
                Node next = curHead.next;

                //计算当前元素在新表中的位置
                int idx = curHead.key % newArray.length;
                //头插
                curHead.next = newArray[idx];
                newArray[idx] = curHead;

                curHead = next;

            }
        }
        array = newArray;
    }

    public void printHashBuket(){
        for(int i = 0; i < array.length; ++i){
            Node cur = array[i];
            while(cur != null){
                System.out.print(cur.key + "-->" + cur.value + "\t");
                cur = cur.next;
            }
        }
        System.out.println();
    }

    public int get(int key){
        //不需要遍历所有数据
        // 只需要去搜索表中的某一个单链表即可
        // 平均时间复杂度O(1)
        int idx = key % array.length;
        Node cur = array[idx];
        while(cur != null){
            if(cur.key == key)
                return cur.value;
            cur = cur.next;
        }
        return -1;
    }

    public int remove(int key){
        // 平均时间复杂度： O(1)
        int idx = key % array.length;
        Node prev = null;
        Node cur = array[idx];
        //单链表的删除
        while(cur != null){
            if(cur.key == key){
                //删除的是头结点
                if(prev == null)
                    array[idx] = cur.next;
                //不是头结点
                else
                    prev.next = cur.next;

                return cur.value;
            }
            else{
                prev = cur;
                cur = cur.next;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        HashBucket hb = new HashBucket();
        hb.put(1,1);
        hb.put(2,2);
        hb.put(3,3);
        hb.put(4,4);
        hb.put(5,5);
        hb.put(6,6);
        hb.put(1, -1);
        hb.put(2, -2);
        hb.printHashBuket();
        System.out.println(hb.get(1));
        System.out.println(hb.get(6));
        System.out.println(hb.remove(5));
        hb.printHashBuket();
        System.out.println(hb.remove(3));
        hb.printHashBuket();
        System.out.println(hb.remove(100));
        hb.printHashBuket();


    }
}
