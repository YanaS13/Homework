package org.example;
import org.junit.Assert;

public class OOPLinkedListTest  {
    @org.junit.Test
    public void OOPLinkedListTest1() {
        OOPLinkedList <String> lOOP = new OOPLinkedList();
        lOOP.add("Женя");
        lOOP.add("Сережа");
        lOOP.add("Ира");
        lOOP.add("Лиза");
        String S = lOOP.get(2);
        Assert.assertEquals(S, lOOP.get(2));
        Assert.assertEquals(4,lOOP.size());
    }
    @org.junit.Test
    public void OOPLinkedListTest2() {
        OOPLinkedList <Integer> lOOP = new OOPLinkedList();
        lOOP.add(18);
        lOOP.add(4);
        lOOP.add(21);
        Integer M = lOOP.get(4);
        Assert.assertEquals(M, lOOP.get(4));
        Assert.assertEquals(3,lOOP.size());
    }
}