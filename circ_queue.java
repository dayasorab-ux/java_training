public class circ_queue{
    static class CircularQueue{
        int[] arr;
        int front;
        int rear;
        int size;
        int capacity;
        CircularQueue(int capacity){
            this.capacity = capacity;
            arr = new int[capacity];
            front = 0;
            rear = -1;
            size = 0;
        }
        void enqueue(int data){
            if(size == capacity){
                System.out.println("queue is full");
                return;
            }
            rear = (rear + 1) % capacity;
            arr[rear] = data;               
        }
    }
}