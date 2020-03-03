package datastructures.linklist;

public class CircularLinkList {

    Node head;

    public CircularLinkList(Node head) {
        this.head = head;
    }

    public static void main(String[] args) {
        implementCircularLinkList();
    }

    /**
     * This method is used to showcase implementation of singly link list.
     * Input : 1, 2, 3                      // Sample input example
     * Required Output : 2 ---> 3 ---> 1   // Sample result example
     */
    private static void implementCircularLinkList() {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        CircularLinkList circularLinkList = new CircularLinkList(head);

        circularLinkList.head.data = 1;
        circularLinkList.head.next = second;
        second.next = third;
        third.next = circularLinkList.head;

        printList(second);
    }

    /**
     * This method is used to print the link list values.
     *
     * @param startNode : It contains the list along with data nodes
     */
    public static void printList(Node startNode) {
        Node currentNode = startNode;
        do {
            if (currentNode.next != startNode) {
                System.out.print(currentNode.data + " ---> ");
            } else {
                System.out.print(currentNode.data);
            }
            currentNode = currentNode.next;
        } while (currentNode != startNode);

    }

    /**
     * Class declaration of Node defining data value and pointer to next node.
     */
    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}







