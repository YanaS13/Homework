package org.example;

public class OOPLinkedList<P>{
    private Node2 root;
    public OOPLinkedList() {
    }
    public void add(P item) {
        Node2 newNode = new Node2(item);
        Node2 lastNode = findLast();
        if (lastNode == null) {
            root = newNode;
        } else {
            lastNode.setNext(newNode);
        }
    }
    private Node2<P> findLast() {
        if (root == null) {
            return null;
        } else {
            Node2 last = root;
            while (last.getNext() != null) {
                last = last.getNext();
            }
            return last;
        }
    }
    public P get(int index) {
        Node2<P> N = root;
        while ((N != null) && (index > 1)) {
            index--;
            N = N.getNext();
        }

        if (N != null) {
            return (P) N.getValue();
        } else {
            return null;
        }

    }
    public int size() {
        Node2<P> N = root;
        int i = 0;
        while (N != null) {
            N = N.getNext();
            i++;
        }
        return i;
    }
}
class Node2<P> {
    private Object value;
    private Node2 next;

    public Node2(P value) {
        this.value = value;
        this.next = null;
    }

    public Node2(P value, Node2 next) {
        this.value = value;
        this.next = next;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(P value) {
        this.value = value;
    }

    public Node2 getNext() {
        return next;
    }

    public void setNext(Node2 next) {
        this.next = next;
    }
}

