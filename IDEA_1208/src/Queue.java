class Node{
    int value;
    Node next;
}
public class Queue {
    Node front;
    Node rear;
    int size;
    public Queue(){
        front = rear =null;
        size = 0;
    }
    public void offer(int value){
        Node newNode = new node();
        newNode.value = value;
        newNode.next = null;
        if(front == null){
            front = rear = newNode;
        }
        else{
            rear.next = newNode;
            rear = rear.next;
        }
        ++size;
    }
    public void poll(){
        if(front == null)
            return;
        front = front.next;
        if(front == null)
            rear = null;
        --size;
    }
    public int peek(){
        if(front ==null)
            return -1;
        return front.value;
    }
    public int rear(){
        if(front == null)
            return -1;
        return rear.value;
    }
    public int size(){
        return size;
    }
}

