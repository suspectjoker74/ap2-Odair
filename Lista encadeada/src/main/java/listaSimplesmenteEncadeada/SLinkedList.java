package listaSimplesmenteEncadeada;

public class SLinkedList {
    protected Node head;
    protected Node tail;
    protected int size;

    public SLinkedList() {
        head = tail = null;
        size = 0;
    }

    public void addHead(String s) {
        Node newNode = new Node(s, head);
        head = newNode;
        
        if (size == 0) {
            tail = head;
        }

        size++;
    }

    public void addTail(String s) {
        Node newNode = new Node(s, null);
        if (size == 0) {
            head = tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    public void removeFirst() {
        if (size == 0) {
            throw new EmptySLinkedList("Lista vazia.");
        }
        Node temp = head;
        head = head.getNext();
        temp.setNext(null);
        size--;
        if (size == 0) tail = null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node current = head;
        while (current != null) {
            sb.append(current.getElement());
            current = current.getNext();
            if (current != null) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
