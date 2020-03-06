package datastructures.queue;

public class QueuesUsingArrays {

    public static void main(String[] args) {

        QueueByArray queue = new QueueByArray(5);
        queue.enQueue(1);
        queue.showElementInQueue();
        queue.deQueue();
        queue.deQueue();
        queue.showElementInQueue();
    }

}

class QueueByArray {
    int[] array;
    int top;
    int rear;
    int capacity;

    QueueByArray(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.top = 0;
        this.rear = -1;
    }

    void enQueue(int newElementToEnter) {
        if (rear + 1 >= capacity) {
            System.out.println("Queue is full");
            System.exit(0);
        }

        rear = rear + 1;
        array[rear] = newElementToEnter;
    }

    void deQueue() {
        if (top +1 >= rear) {
            System.out.println("Queue is empty");
            System.exit(0);
        }

        top = top + 1;

    }

    void showElementInQueue() {
        for (int i = top; i <= rear; i++) {
            System.out.println(array[i]);
        }

    }
}


