package linkedlistloop;

import java.util.List;

public class LinkedList<T> {

    private Node<T> head;

    public LinkedList(Node<T> head) {
        this.head = head;
    }

    public LinkedList(List<T> elements) {
        Node<T> previous = null;
        for (T element : elements) {
            Node<T> node = new Node<>(element);
            if (previous != null) {
                previous.setNext(node);
            } else {
                this.head = node;
            }
            previous = node;
        }
    }

    public Node<T> getHead() {
        return this.head;
    }

    public void setHead(Node<T> value) {
        this.head = value;
    }

    public boolean isCircular() {
        Node<T> slowCursor = this.head, fastCursor = this.head;
        
        while (fastCursor != null && fastCursor.getNext() != null) {
            slowCursor = slowCursor.getNext();
            fastCursor = fastCursor.getNext().getNext();
            if (slowCursor == fastCursor) {
                return true;
            }
        }
        return false;
    }

    public Node<T> firstNodeOfCircularLoop() {
        Node<T> slowCursor = this.head, fastCursor = this.head;

        while (fastCursor != null && fastCursor.getNext() != null) {
            slowCursor = slowCursor.getNext();
            fastCursor = fastCursor.getNext().getNext();
            if (slowCursor == fastCursor) {
                break;
            }
        }

        if (fastCursor == null || fastCursor.getNext() == null) {
            return null;
        }

        slowCursor = this.head;
        while (slowCursor != fastCursor) {
            slowCursor = slowCursor.getNext();
            fastCursor = fastCursor.getNext();
        }

        return slowCursor;
    }

}