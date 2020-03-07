package datastructures.queue;

public class QueuesUsingArrays {
    public static void main(String[] args) {
        implementQueuesByArray();
    }

    /**
     * This method is used to show implementation of Queues First In First Out enQueue and deQueue concept
     * by using arrays.
     */
    private static void implementQueuesByArray() {

        QueueByArray queue = new QueueByArray(5);

        // Adding element to queue
        queue.enQueue(1);
        queue.enQueue(2);

        // Printing elements present currently in Queue
        queue.showElementInQueue();

        // Removing element from Queue from the front
        queue.deQueue();

        // Removing elements now until queue is empty
        queue.showElementInQueue();
        queue.deQueue();
        queue.showElementInQueue();
        queue.deQueue();
    }
}

/**
 * Class declaration of Queue with enQueue and deQueue method implementation.
 */
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

    /**
     * This method is used to add element to the last of the Queue.
     *
     * @param newElementToEnter : It contains the element value to be added in th Queue.
     */
    void enQueue(int newElementToEnter) {

        // Checking for queue to be full of capacity and displaying relevant message for the same
        if (rear + 1 >= capacity) {
            System.out.println("Queue is full");
            System.exit(0);
        }

        // Pointing index of rear last element of Queue to the new added element index
        rear = rear + 1;

        // Adding new element to last rear index of Queue
        array[rear] = newElementToEnter;
    }

    /**
     * This method is used to remove element from front of the Queue
     */
    void deQueue() {
        // If Queue is empty displaying relevant message
        if (top + 1 > rear) {
            System.out.println("Queue is empty");
            System.exit(0);
        }

        // Removing  top element from Queue by pointing top front to next index element in Queue
        top = top + 1;
    }

    /**
     * This method is used to show elements present in the Queue
     */
    void showElementInQueue() {
        for (int i = top; i <= rear; i++) {
            System.out.println(array[i]);
        }
    }
}


