package datastructures.linklist;

public class DoublyCircularLinkList {

    public static void main(String[] args) {

        implementDoublyCircularLinkList();
    }

    /**
     * This method is used to showcase implementation of doubly circular link list.
     * Input : 1, 2, 3                      // Sample input example
     * Required Output :                    // Sample result example
     * Printing in forward direction
     * 1
     * 2
     * 0
     * Printing in backward direction
     * 2
     * 1
     * 0
     */
    private static void implementDoublyCircularLinkList() {
        Node startNode = new Node(0);
        Node second = new Node(1);
        Node third = new Node(2);
        DoublyCircularList doublyCircularList = new DoublyCircularList(startNode);

        doublyCircularList.startNode.next = second;
        second.next = third;
        third.next = doublyCircularList.startNode;

        third.previous = second;
        second.previous = doublyCircularList.startNode;
        startNode.previous = third;

        printListForward(second);
        printListBackward(third);
    }

    /**
     * This method is used to print link list in forward direction.
     *
     * @param startingNode : It is the node point from which list traversal has to be started
     */
    static void printListForward(Node startingNode) {
        System.out.println("Printing in forward direction");
        Node currentNode = startingNode;
        do {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        } while (startingNode != currentNode);
    }

    /**
     * This method is used to print link list in reverse direction.
     *
     * @param startingNode : It is the node point from which list traversal has to be started
     */
    static void printListBackward(Node startingNode) {
        System.out.println("Printing in backward direction");

        Node currentNode = startingNode;
        do {
            System.out.println(currentNode.data);
            currentNode = currentNode.previous;
        } while (startingNode != currentNode);
    }

    /**
     * Class declaration for doubly circular link list
     */
    static class DoublyCircularList {
        Node startNode;

        DoublyCircularList(Node startNode) {
            this.startNode = startNode;
        }
    }

    /**
     * Class declaration for Node with data value along with previous and next node pointer reference
     */
    static class Node {
        int data;
        Node next;
        Node previous;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }
}
