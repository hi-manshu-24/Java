package assignment1;

class Queue {
    int[] arr;
    int front;
    int rear;
    int size;
    int capacity;

    Queue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    void enqueue(int element) {
        if (size == capacity) {
            System.out.println("Queue is full. Cannot enqueue " + element);
        } else {
            rear = (rear + 1) % capacity;
            arr[rear] = element;
            size++;
            System.out.println("Enqueued: " + element);
        }
    }

    void dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty. Cannot dequeue.");
        } else {
            System.out.println("Dequeued: " + arr[front]);
            front = (front + 1) % capacity;
            size--;
        }
    }
    
    void display() {
        if (size == 0) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue elements: ");
            int i = front;
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i] + " ");
                i = (i + 1) % capacity; 
            }
            System.out.println();
        }
    }
}

public class Question_26 {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.dequeue();
        queue.dequeue();

        queue.enqueue(60);

        queue.display();
    }
}