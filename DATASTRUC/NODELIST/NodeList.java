/*Written by: Janelie S. Blanco BSCS 2A   October 5,2024*/
public class NodeList {
    Node head;
    Node tail;
    int counter;

    public NodeList() {
        head = null;
        tail = null;
        counter = 0;
    }

    public boolean add(Node item) {
        Node newNode = item;

        if (head == null) {
            newNode.previous = null;
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
        
        counter++;

        return true;
    }

    public boolean delete(int location) {
        Node curr;
        int currentIndex = 0;

        if (isEmpty()) {
            return false;
        } else {
            curr = head;
            while (curr != null && currentIndex < location) {
                curr = curr.next;
                currentIndex++;
            }
        }
        if (curr == null) {
            return false;
        }
        if (curr == head) {
            head = head.next; 
            if (head != null) {
                head.previous = null; 
            } else {
                tail = null; 
            }
        } else if (curr == tail) {
            tail = tail.previous;
            tail.next = null; 
        } else {
            curr.previous.next = curr.next;
            curr.next.previous = curr.previous;
        }

        --counter;

        return true;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return;
        }

        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println(); 
    }
}