public class CircularDemo {
    int rear = 0;
    int front = 0;
    int maxSize;
    int[] arr;
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public CircularDemo(int k) {
        maxSize = k + 1;
        arr = new int[maxSize];
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }else{
            arr[rear] = value;
            rear =( rear + 1) % maxSize;
            return true;
        }
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }else{
            front = (front + 1) % maxSize;
            return true;
        }
    }

    /** Get the front item from the queue. */
    public int Front() {
        if (isEmpty()){
            return -1;
        }else {
            return arr[front];
        }
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if(isEmpty()){
            return -1;
        }else{
            return arr[(rear - 1 + maxSize) % maxSize];
        }
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return front = rear;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return (rear + 1) % maxSize ==front;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */