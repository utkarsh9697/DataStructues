package datastructures.queue;

import java.util.Stack;

public class QueuesUsingStack {

    public static void main(String[] args) {
        implementQueuesUsingStacks();
    }

    /**
     * This method is used  to showcase implementation of Queues by using stacks. It showcases the First In First Out
     * (FIFO) approach followed in queues.
     */
    private static void implementQueuesUsingStacks() {

        // Initializing a new Queue
        Queue queue = new Queue();

        // Adding elements to queue
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);

        // Removing elements from queue
        System.out.println("Element removed is " + queue.deQueue());
        System.out.println("Element removed is " + queue.deQueue());
        System.out.println("Element removed is " + queue.deQueue());
        System.out.println(queue.deQueue());
    }
}

/**
 * Class initialization of queue with enqueue and dequeue methods.
 */
class Queue {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> temporaryStack = new Stack<>();

    /**
     * This method is used to add element to the rear of the  queue following the FIFO approach.
     *
     * @param newElementToBeInsertedInQueue : The new element that will be placed at the end of the queue.
     */
    void enQueue(int newElementToBeInsertedInQueue) {

        // Adding values to temporary stack in order to reverse the order of stack
        while (!stack.empty()) {
            temporaryStack.push(stack.pop());
        }
        // Adding new element to the last of stack queue at the end of the queue
        stack.push(newElementToBeInsertedInQueue);

        // Re-adding values in stack queue in reverse order
        while (!temporaryStack.empty()) {
            stack.push(temporaryStack.pop());
        }
    }


    /**
     * This method is used to remove the element at the front of the queue following the FIF approach.
     *
     * @return : It returns the element in front of the queue being removed.
     */
    int deQueue() {
        int dequeElementValue;

        // If stack queue is empty then display error message and exit
        if (stack.empty()) {
            System.out.println("Queue is empty");
            System.exit(0);
        }

        // Remove the element at top from the stack queue
        dequeElementValue = stack.peek();
        stack.pop();
        return dequeElementValue;
    }
}
