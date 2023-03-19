package org.example;
import org.junit.Assert;

public  class LinkedListTest {

    @org.junit.Test
    public void LinkedListTest1() {
        LinkedList li = new LinkedList();
        li.add(2);
        li.add(4);
        li.add(17);
        Assert.assertEquals(2, li.get(1));
        Assert.assertEquals(4, li.get(2));
    }

    @org.junit.Test
    public void LinkedListTest2() {
        LinkedList l = new LinkedList();
        l.add("Женя");
        l.add("Сережа");
        l.add("Ира");
        Assert.assertEquals(3,l.size());

    }
}