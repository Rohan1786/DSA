package List;

import java.util.LinkedList;

public class practiseLL {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFront(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("hello");
        System.out.println(list);
    }

}
