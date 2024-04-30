package List;

// import java.util.LinkedList;

// public class LL {
//     Node head;

//     class Node {
//         String data;
//         Node next;

//         Node(String data) {
//             this.data = data;
//             this.next = null;

//         }
//     }

//     public void deleteFirst() {

//         if (head == null) {
//             System.out.println("cant remove");
//             return;
//         }
//         head = head.next;

//     }

//     public void addFirst(String data) {
//         Node newnode = new Node(data);
//         if (head == null) {
//             head = newnode;
//             return;
//         }
//         newnode.next = head;
//         head = newnode;

//     }

//     public void addlast(String data) {
//         Node newNode = new Node(data);

//         if (head == null) {
//             head = newNode;
//             return;

//         }
//         Node currnode = head;
//         while (currnode.next != null) {
//             currnode = currnode.next;
//         }
//         currnode.next = newNode;
//     }

//     public void printList() {
//         Node currNode = head;

//         while (currNode != null) {
//             System.out.print(currNode.data + " -> ");
//             currNode = currNode.next;
//         }

//         System.out.println("null");
//     }

//     public static void main(String[] args) {

//         LinkedList<String> list = new LinkedList<String>();
//         list.addFirst("is");
//         list.addFirst("a");

//         list.addLast("man");
//         list.addLast("ma2");

//         // LL list1 = new LL();

//         System.out.println(list);

//         list.addFirst("hi");

//     }
// }

class LL {

    Node head;
    private int size;

    LL() {
        size = 0;
    }

    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }

        lastNode.next = newNode;
    }

    public void printList() {
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("null");
    }

    // public void removeFirst() {
    // if (head == null) {
    // System.out.println("Empty List, nothing to delete");
    // return;
    // }

    // head = this.head.next;
    // size--;
    // }

    public void removeFirst() {
        if (head == null) {
            System.out.println("cant delete");
            return;

        }
        size--;
        head = head.next;
    }

    // public void removeLast() {
    // if (head == null) {
    // System.out.println("Empty List, nothing to delete");
    // return;
    // }

    // size--;
    // if (head.next == null) {
    // head = null;
    // return;
    // }

    // Node currNode = head;
    // Node lastNode = head.next;
    // while (lastNode.next != null) {
    // currNode = currNode.next;
    // lastNode = lastNode.next;
    // }

    // currNode.next = null;
    // }

    public void removeLast() {
        if (head == null) {
            System.out.println("cant remove");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node currnode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            currnode = currnode.next;
        }
        currnode.next = null;
    }

    public int getSize() {
        return size;
    }

    public void reverseList() {
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    // by recursive method we get recursive list

    public Node RecursiveListe(Node head) {
        if (head == null || head.next == null) {
            return head;

        }
        Node newNode = RecursiveListe(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }

    public static void main(String args[]) {
        LL list = new LL();
        list.addLast("is");
        list.addLast("a");
        list.addLast("list");
        list.printList();

        list.addFirst("this");
        list.printList();
        System.out.println(list.getSize());

        // list.removeLast();
        // list.printList();
        // list.removeFirst();
        list.printList();
        list.reverseList();
        list.printList();
        System.out.println("\n\n\n\n.....by using recursive methods.....\n\n\n");

        list.head = list.RecursiveListe(list.head);
        list.printList();

    }
}