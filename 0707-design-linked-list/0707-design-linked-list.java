class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class MyLinkedList {

    Node head;
    Node tail;
    int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    // Get value at index
    public int get(int index) {

        if (index < 0 || index >= size) {
            return -1;
        }

        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp.val;
    }

    // Add node at head
    public void addAtHead(int val) {

        Node newn = new Node(val);

        if (head == null) {
            head = tail = newn;
        } else {
            newn.next = head;
            head = newn;
        }

        size++;
    }

    // Add node at tail
    public void addAtTail(int val) {

        Node newn = new Node(val);

        if (head == null) {
            head = tail = newn;
        } else {
            tail.next = newn;
            tail = newn;
        }

        size++;
    }

    // Add node at index
    public void addAtIndex(int index, int val) {

        if (index > size) return;

        if (index < 0) index = 0;

        if (index == 0) {
            addAtHead(val);
            return;
        }

        if (index == size) {
            addAtTail(val);
            return;
        }

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        Node newn = new Node(val);

        newn.next = temp.next;
        temp.next = newn;

        size++;
    }

    // Delete node at index
    public void deleteAtIndex(int index) {

        if (index < 0 || index >= size) return;

        if (index == 0) {
            head = head.next;

            if (head == null) {
                tail = null;
            }

            size--;
            return;
        }

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        if (temp.next == tail) {
            tail = temp;
        }

        temp.next = temp.next.next;

        size--;
    }
}