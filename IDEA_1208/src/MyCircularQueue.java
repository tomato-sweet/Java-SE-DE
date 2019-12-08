public class MyCircularQueue {
    int array;
    int capacity;
    int size;
    int front;	// 队首下标
    int rear;	// 队尾下标

   //在这里初始化数据结构。将队列的大小设置为k.
    public MyCircularQueue(int k) {
        array = new int[k];
        capacity = k;
        size = 0;
        front = 0;
        rear = 0;
    }

    //在循环队列中插入一个元素。如果操作成功，返回true。
    public boolean enQueue(int value) {
        if (size == capacity) {
            return false;
        }
        array[rear] = value;
        rear = (rear + 1) % capacity;
        size++;
        return true;
    }

    //从循环队列中删除一个元素。如果操作成功，返回true。
  public boolean deQueue() {
        if (size == 0) {
            return false;
        }
        front = (front + 1) % capacity;
        size--;
        return true;
    }

    //从队列中获取前端项。
    public int Front() {
        return array[front];
    }

    //从队列中获取最后一项。
    public int Rear() {
        int index = (rear + capacity - 1) % capacity;
        return array[index];
    }

    //检查循环队列是否为空。
    public boolean isEmpty() {
        return size == 0;
    }

    //检查循环队列是否已满。
    public boolean isFull() {
        return size == capacity;
    }
}
