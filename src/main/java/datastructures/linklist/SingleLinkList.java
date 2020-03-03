package datastructures.linklist;

public class SingleLinkList {


    public static void main(String[] args) {
        implementLinkList();
    }

    /**
     * This method is used to showcase implementation of singly link list.
     * Input : 1, 2, 3                      // Sample input example
     * Required Output : 1 ---> 2 ---> 3    // Sample result example
     */
    private static void implementLinkList() {

        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        LinkList linkList = new LinkList(head);

        linkList.head.next = second;
        second.next = third;

        printList(linkList);
    }

    /**
     * This method is used to print the link list values.
     *
     * @param linkList : It contains the list along with data nodes
     */
    private static void printList(LinkList linkList) {
        Node currentNode = linkList.head;

        while (currentNode != null) {
            if (currentNode.next != null) {
                System.out.print(currentNode.data + " ---> ");
            } else {
                System.out.print(currentNode.data);
            }
            currentNode = currentNode.next;
        }
    }

    /**
     * Class declaration of Node defining data value and pointer to next node.
     */
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * Class declaration of Link list with defined head.
     */
    static class LinkList {
        Node head;

        LinkList(Node head) {
            this.head = head;
        }
    }
}


