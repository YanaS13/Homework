package org.example;
public class LinkedList {
    private Node1 root;
    public LinkedList() {
    }
    public void add(Object item) {
        Node1 newNode = new Node1(item);
        Node1 lastNode = findLast();
        if (lastNode == null) {
            root = newNode;
        } else {
            lastNode.setNext(newNode);
        }
    }
    private Node1 findLast() {
        if (root == null) {
            return null;
        } else {
            Node1 last = root;
            while (last.getNext() != null) {
                last = last.getNext();
            }
            return last;
        }
    }
    public Object get(int index) {
        Node1 N = root;
        while ((N != null) && (index > 1)) {
            index--;
            N = N.getNext();
        }

        if (N != null) {
            return  N.getValue();
        } else {
            return "Нет элемента с таким номером" ;
        }

    }
    public int size() {
        Node1 N = root;
        int i = 0;
        while (N != null) {
            N = N.getNext();
            i++;
        }
        return i;
    }
}
class Node1 {
    private Object value;
    private Node1 next;

    public Node1(Object value) {
        this.value = value;
        this.next = null;
    }

    public Node1(Object value, Node1 next) {
        this.value = value;
        this.next = next;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Node1 getNext() {
        return next;
    }

    public void setNext(Node1 next) {
        this.next = next;
    }
}

