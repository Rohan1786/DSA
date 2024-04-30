package queve;

public class quevey {

    static class queue {
        static int size;
        static int arr[];
        static int rear;

        queue(int size) {

            this.size = size;
            arr = new int[size];
            rear = -1;

        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public static boolean isFull() {
            return rear == size - 1;
        }

        public static void add(int data) {
            if (isFull()) {
                System.out.println("queue is full");
            }
            arr[++rear] = data;

        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;

            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;

        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("qeue is empty");
                return -1;
            }

            return arr[0];
        }
    }

    public static void main(String[] args) {

        queue q = new queue(9);

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(8);
        q.add(7);

        // System.out.println(q.remove());
        // System.out.println(q.remove());
        // System.out.println(q.remove());
        System.out.println(q.peek());

    }

}
