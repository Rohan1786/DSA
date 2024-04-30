package List;

public class DLL {
    NODE head;

    public static class NODE {
        String data;
        NODE next;
        NODE prev;

        NODE(String data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // public void insertAtFirst(String data) {
    // NODE newNode = new NODE(data);
    // newNode.next = head;
    // newNode.prev = null;
    // // head.prev = newNode;

    // // head = newNode;
    // if (head != null) {
    // head.prev = newNode;
    // }
    // head = newNode;

    // }
    public static void display(NODE head) {
        NODE temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void displayrev(NODE tail) {
        NODE temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // DLL dll = new DLL();
        NODE a = new NODE("hi");
        NODE b = new NODE("hello");
        NODE c = new NODE("how are you");
        NODE d = new NODE("fine");
        a.next = b;
        a.prev = null;
        b.next = c;
        b.prev = a;
        c.next = d;
        c.prev = b;
        d.next = null;
        d.prev = c;

        display(a);
        displayrev(d);
    }
}