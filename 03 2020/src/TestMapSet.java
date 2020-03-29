import java.util.*;
class IntComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}
public class TestMapSet {
    public static void testMap(){
        Map<String, String> mp = new TreeMap<>();
        // Map: key 不重复， value 可以重复
        //插入：put： key不存在，直接插入，key如果存在，修改key对应的value
        mp.put("周荣", "20080311");
        //System.out.println(mp.get("周荣"));
        mp.put("王继文", "20160211");
        mp.put("周荣", "20120020");
        mp.put("陈老师", "20120020");
        // get
        //System.out.println(mp.get("周荣"));
        //System.out.println(mp.get("陈老师"));
        /*
        System.out.println(mp.get("王"));
        System.out.println(mp.getOrDefault("王", "00000"));
        System.out.println(mp.getOrDefault("周荣", "1111"));

         */
        //System.out.println(mp.remove("周荣"));
       // System.out.println(mp.remove("周荣"));

        //System.out.println(mp.containsKey("王继文"));
        //System.out.println(mp.containsValue("20120020"));
        System.out.println("keySet:");
        Set<String> keySet = mp.keySet();
        for(String key : keySet){
            System.out.println(key);
        }
        System.out.println("Values: ");
        Collection<String> values = mp.values();
        for(String v : values){
            System.out.println(v);
        }
        System.out.println("EntrySet:");
        Set<Map.Entry<String, String>> entrySet = mp.entrySet();
        for(Map.Entry<String, String> es : entrySet){
            System.out.println(es.getKey() + "---->"  + es.getValue());
        }
    }

    public static void testSet()
    {
        Set<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(1);
        set.add(2);
        set.add(-2);
        set.add(100);
        //遍历时有序
        for(Integer e : set){
            System.out.print(e + " ");
        }
        System.out.println();

        System.out.println("迭代器：搜索树的中序遍历");
        Iterator<Integer> it = set.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next() + " ");
        }
    }

    public static void main(String[] args) {
        //testMap();
        testSet();
    }
}
/*
class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int num :nums){
            /*
            Integer n = mp.get(num);
            if(n == null)
                mp.put(num, 1);
            else{
                ++n;
                mp.put(num, n);
            }
            */
/*
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        for(int num : nums){
            if(mp.get(num) == 1)
                return num;
        }
        return -1;
    }
}

class Solution {
    public int singleNumber(int[] nums) {
        int ret = 0;
        for(int num :nums)
            ret ^= num;
        return ret;
    }
}

class Solution {
    public int numJewelsInStones(String J, String S) {
        Set<Character> set = new HashSet<>();
        for(char ch : J.toCharArray()){
            set.add(ch);
        }
        int count = 0;
        for(char ch : S.toCharArray()){
            if(set.contains(ch))
                ++count;
        }
        return count;
    }
}
*/
/*
class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String right = scanner.nextLine();
        String wrong = scanner.nextLine();
        //首先把错误的保存
        Set<Character> wrongSet = new HashSet<>();
        for(char ch : wrong.toCharArray()){
            wrongSet.add(ch);
        }
        Set<Character> printSet = new HashSet<>();
        //遍历正确的，在wrongSet查找
        for(char ch : right.toCharArray()){
            if(!wrongSet.contains(ch)){
                //ch对应的键是坏的
                //判断是否第一次遇到
                ch = Character.toUpperCase(ch);
                if(!printSet.contains(ch)){
                    printSet.add(ch);
                    System.out.print(ch);

                }
            }
        }
        printSet.clear();
        System.out.println();
    }
}

// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null)
            return null;
        //拷贝节点
        Node cur = head;
        while(cur != null){
            Node next = cur.next;
            Node copy = new Node(cur.val);
            cur.next = copy;
            copy.next = next;
            cur = next;
        }
        //链接随机指针
        cur = head;
        Node copy = head.next;
        while(cur != null){
            copy = cur.next;
            Node next = copy.next;
            if(cur.random != null){
                copy.random = cur.random.next;
            }
            else
                copy.random = null;

            cur = next;

        }
        //拆链
        cur = head;
        Node newH = head.next;
        copy = newH;
        while(cur != null){
            Node next = copy.next;
            cur.next = next;
            if(next != null)
                copy.next = next.next;
            cur = next;
            copy = copy.next;
        }
        return newH;
    }
}

class NodeComparator implements  Comparator<Node>{
    @Override
    public int compare(Node o1, Node o2) {
        return o1.val - o2.val;
    }
}
class Solution {
    public Node copyRandomList(Node head) {
        if(head == null)
            return null;
        Map<Node, Node> mp = new HashMap<>();
        Node newH, newT;
        newH = newT = null;
        Node cur = head;
        while(cur != null){
            Node node = new Node(cur.val);
            if(newH == null){
                newH = newT = node;
            }else
            {
                newT.next = node;
                newT = newT.next;
            }
            //构建一个映射关系
            mp.put(cur, node);
            cur = cur.next;
        }
        //构建随机指针
        cur = head;
        newT = newH;
        while(cur != null){
            if(cur.random != null){
                newT.random = mp.get(cur.random);
            }else
            {
                newT.random = null;
            }
            cur = cur.next;
            newT = newT.next;
        }
        return newH;
    }
}

class EntryComparator implements Comparator<Map.Entry<String, Integer>>{
    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        int diff = o2.getValue() - o1.getValue();
        if(diff == 0){
            return o1.getKey().compareTo(o2.getKey());
        }
        return diff;
    }
}

 */
/*
时间复杂度：O(nlogn)
空间复杂度：O(n)
 */
/*
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> mp = new HashMap<>();
        //统计单词出现的次数
        for(String word : words){
            mp.put(word, mp.getOrDefault(word, 0) + 1);
        }
        //建大堆： KV数据
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(new EntryComparator());
        for(Map.Entry<String, Integer> en : mp.entrySet()){
            //入队
            pq.offer(en);

            */
            /*
            if(pq.size() > k){
                //出队， 保证队列中最多只有k个元素
                pq.poll();
            }
            */
            /*
        }
        //取出大堆中的K个元素
        List<String> lst = new ArrayList<>();
        while(k-- != 0){
            lst.add(pq.poll().getKey());
        }
        return lst;
    }
}

class EntryComparator implements Comparator<Map.Entry<String, Integer>>{
    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        int diff = o1.getValue() - o2.getValue();
        if(diff == 0){
            return o1.getKey().compareTo(o2.getKey());
        }
        return diff;
    }
}
*/
/*
时间复杂度：O(nlogk)
空间复杂度：O(n)
 */
/*
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> mp = new HashMap<>();
        //统计单词出现的次数
        for(String word : words){
            mp.put(word, mp.getOrDefault(word, 0) + 1);
        }
        //建小堆： KV数据
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(new EntryComparator());
        for(Map.Entry<String, Integer> en : mp.entrySet()){
            //入队
            pq.offer(en);

            if(pq.size() > k){
                //出队， 保证队列中最多只有k个元素
                pq.poll();
            }

        }
        //取出小堆中的所有元素
        LinkedList<String> lst = new LinkedList<>();
        while(!pq.isEmpty()){
            //lst.add(pq.poll().getKey());
            lst.addFirst(pq.poll().getKey());
        }
        return lst;
    }
}
*/
